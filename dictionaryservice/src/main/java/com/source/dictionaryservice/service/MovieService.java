package com.source.dictionaryservice.service;
import java.util.List;
import com.source.dictionaryservice.model.MovieDO;
import com.source.mongo.models.MovieLists;

public interface MovieService {
 
	 public MovieLists getMovies();
	 
	 public MovieLists searchMoviesByName(String searchText);
	 
	 public List<MovieDO> searchMoviesByArtistName(String searchText);
	 
}
