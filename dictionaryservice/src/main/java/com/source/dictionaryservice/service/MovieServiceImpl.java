package com.source.dictionaryservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.source.dictionaryservice.model.MovieDO;
import com.source.dictionaryservice.utils.MovieInfoLoader;
import com.source.mongo.models.MovieLists;

@Component
public class MovieServiceImpl implements MovieService {

	
	
	@Override
	public MovieLists getMovies() {
		// TODO Auto-generated method stub
		return MovieInfoLoader.loadMoviesFromResourcetoDBModel(null);
	}

	@Override
	public MovieLists searchMoviesByName(String searchText) {
		// TODO Auto-generated method stub
		
		MovieLists movies = new MovieLists();
		movies.setMovies(MovieInfoLoader.
				loadMoviesFromResourcetoDBModel(null).
				getMovies().stream().filter(movie ->{
					return movie.getMovieName().toLowerCase().contains(searchText.toLowerCase());
			  }).collect(Collectors.toSet()));
		
		return movies;
	}

	@Override
	public List<MovieDO> searchMoviesByArtistName(String searchText) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
