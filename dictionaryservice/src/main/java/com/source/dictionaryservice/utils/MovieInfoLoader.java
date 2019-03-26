package com.source.dictionaryservice.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.source.dictionaryservice.model.MovieDO;
import com.source.dictionaryservice.model.MovieResourceDO;
import com.source.mongo.models.MovieLists;

public class MovieInfoLoader {

	private MovieInfoLoader() {

	}

	public static List<MovieResourceDO> loadMovieFromResource(String fileLocation) {
		
		if(null == fileLocation)
			fileLocation = "C:\\PerDev\\git\\Java\\dictionaryservice\\src\\main\\resources\\data\\movies.json";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
			Gson gson = new GsonBuilder().create();
			MovieResourceDO[] movies = gson.fromJson(br, MovieResourceDO[].class);
			List<MovieResourceDO> moviesList = Arrays.asList(movies);
			System.out.println("Movies count " + moviesList.size());
			return moviesList;

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (JsonParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public static MovieLists loadMoviesFromResourcetoDBModel(String file) {
		MovieLists moviesList = new MovieLists();
		Set<MovieDO> movies = loadMovieFromResource(null).stream().map(MovieResourceDOObj -> {
		    return new MovieDO(MovieResourceDOObj.getTitle(),
		    		MovieResourceDOObj.getYear(),
		    		"EN",
		    		Arrays.asList(null != MovieResourceDOObj.getCast() && MovieResourceDOObj.getCast().length > 0 ?  MovieResourceDOObj.getCast() : new String[]{"N/A"}),
		    		Arrays.asList(null != MovieResourceDOObj.getGenre() && MovieResourceDOObj.getGenre().length > 0 ?  MovieResourceDOObj.getGenre() : new String[]{"N/A"})
		    		);
		}).collect(Collectors.toSet());
		moviesList.setMovies(movies);
		return moviesList;
    }
}
