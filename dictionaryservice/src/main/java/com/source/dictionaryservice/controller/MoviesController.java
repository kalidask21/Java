package com.source.dictionaryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.source.dictionaryservice.service.MovieService;
import com.source.mongo.models.MovieLists;

@RestController
public class MoviesController {

	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public ResponseEntity<MovieLists> getmovies(){
		return new ResponseEntity<MovieLists>(movieService.getMovies(),HttpStatus.OK);
	}
	
	@GetMapping("/movies/search")
	public ResponseEntity<MovieLists> getsearch(@RequestParam("s") String searchMovie){
		if(null == searchMovie || searchMovie.length() < 3)
			return new ResponseEntity<MovieLists>(new MovieLists(),HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<MovieLists>(movieService.searchMoviesByName(searchMovie),HttpStatus.OK);
	}
	
}
