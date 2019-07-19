package ibm.ibmDemo.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import ibm.ibmDemo.beans.GasInventory;

public class JsonGasInventoryParser {
	
	private static final String EMISSOIN_LINK = "https://data.sfgov.org/resource/pxac-sadh.json";
	
	public static List<GasInventory> parse() {
		// One Commodity has several Emissions (aggregation of Data)
		ListMultimap<String, String> emissions = ArrayListMultimap.create();
		// GasInventory Object with all Data-Informations
		List<GasInventory> inventories = new LinkedList<GasInventory>();
		// get Data as JSON
		try {
			URL url = new URL(EMISSOIN_LINK);
			URLConnection request = url.openConnection();
			request.connect();
			JsonParser jp = new JsonParser();
			JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
			JsonArray jsonArray = root.getAsJsonArray();
			for (JsonElement je : jsonArray) {
				JsonObject jsonObj = je.getAsJsonObject();
				String sourceType = jsonObj.get("source_type").getAsString();
				String emissionsMtco2e = jsonObj.get("emissions_mtco2e").getAsString();
				emissions.put(sourceType, emissionsMtco2e);
			}			
			for(String e : emissions.keySet()) {
				inventories.add(new GasInventory(e, emissions.get(e)));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return inventories;
	}
}
