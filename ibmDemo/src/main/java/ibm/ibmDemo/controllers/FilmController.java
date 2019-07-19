package ibm.ibmDemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ibm.ibmDemo.beans.Film;
import ibm.ibmDemo.beans.FilmResponse;
import ibm.ibmDemo.utils.JsonFilmParser;

@RestController
public class FilmController {
	
    @RequestMapping("/greeting")
    public String greeting() {
        return "Test RestAPI";
    }
	
    /*
    List every film in the database, if location is not available it is shown too.
    If there is no location specified, the field should be an empty string.
     */
    @RequestMapping(method = RequestMethod.GET, value="/allMovies")
    @ResponseBody
    public List<FilmResponse> getAllMovies() {
        List<Film> films = JsonFilmParser.parse();
        List<FilmResponse> response = new ArrayList<>();

        for(Film f : films) {
            for (String location : f.getLocations()) {
                response.add(new FilmResponse(f.getTitle(), location));
            }
        }
        return response;
    }

    /*
    Filter by title
     */
    @RequestMapping(method = RequestMethod.GET, value="/film")
    @ResponseBody
    public List<FilmResponse> getMoviesByName(@RequestParam(value = "title", required = true) String title) {
        List<Film> films = JsonFilmParser.parse();
        List<FilmResponse> response = new ArrayList<>();

        for(Film f : films) {
            if (f.getTitle().equals(title)) {
                for (String location : f.getLocations()) {
                    response.add(new FilmResponse(f.getTitle(), location));
                }
            }
        }

        return response;
    }

}
