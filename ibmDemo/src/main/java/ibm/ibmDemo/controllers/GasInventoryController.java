package ibm.ibmDemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ibm.ibmDemo.beans.GasInventory;
import ibm.ibmDemo.beans.GasInventoryResponse;
import ibm.ibmDemo.utils.JsonGasInventoryParser;

@RestController
public class GasInventoryController {
    /*
    List every film in the database, if location is not available it is shown too.
    If there is no location specified, the field should be an empty string.
     */
    @RequestMapping(method = RequestMethod.GET, value="/allEmissions")
    @ResponseBody
    public List<GasInventoryResponse> getAllGasInventories() {
        List<GasInventory> gasInventories = JsonGasInventoryParser.parse();
        List<GasInventoryResponse> response = new ArrayList<>();

        for(GasInventory gi : gasInventories) {
            for (String emissionsMtco2e : gi.getEmissionsMtco2e()) {
                response.add(new GasInventoryResponse(gi.getSourceType(), emissionsMtco2e));
            }
        }
        return response;
    }

    /*
    Filter by sourceType
     */
    @RequestMapping(method = RequestMethod.GET, value="/emission")
    @ResponseBody
    public List<GasInventoryResponse> getMoviesByName(@RequestParam(value = "sourceType", required = true) String sourceType) {
        List<GasInventory> inventories = JsonGasInventoryParser.parse();
        List<GasInventoryResponse> response = new ArrayList<>();
        for(GasInventory gi : inventories) {
            if (gi.getSourceType().equals(sourceType)) {
                for (String emissionsMtco2e : gi.getEmissionsMtco2e()) {
                    response.add(new GasInventoryResponse(gi.getSourceType(), emissionsMtco2e));
                }
            }
        }
        return response;
    }
}
