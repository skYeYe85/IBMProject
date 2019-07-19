package ibm.ibmDemo.utils;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import ibm.ibmDemo.beans.Film;

public class JsonFilmParser {
	
	public static List<Film> parse() {
		/*
		 * For storing the data from the database I use a MultiMap because the same movie
		 * may have various locations
		 */
		ListMultimap<String, String> movies = ArrayListMultimap.create();
		/*
		 * Since we will want to have all the information for the movies, Film is the
		 * representative Object for it. Now we just want Title and Locations, in the
		 * future we might add some more.
		 */
		List<Film> films = new LinkedList<Film>();

		JSONParser parser = new JSONParser();

		try {
			/*
			 * I use the API provided in the website to get all the data. Note that another
			 * option is to download the data as CSV, parse it and store it (but local data
			 * will not be up to date)
			 */
			URL database = new URL("https://data.sfgov.org/resource/wwmu-gmzc.json");
			URLConnection yc = database.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				sb.append(inputLine);
			}
			in.close();

			/* Once we have read the data as a String, we have to parse it */
			JSONArray array = (JSONArray) parser.parse(sb.toString());
			Iterator it = array.iterator();

			while (it.hasNext()) {
				JSONObject object = (JSONObject) it.next();
				String title = object.get("title").toString();
				String location = Objects.toString(object.get("locations"), "");
				movies.put(title, location);
			}

			/* Create the Film Object */
			for (String m : movies.keySet()) {
				films.add(new Film(m, movies.get(m)));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return films;
	}
}
