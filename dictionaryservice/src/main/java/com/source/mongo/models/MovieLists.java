package com.source.mongo.models;

import java.util.Set;

import org.springframework.data.annotation.Id;

import com.source.dictionaryservice.model.MovieDO;

public class MovieLists {

	@Id
	private String id;
	private Set<MovieDO> movies;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Set<MovieDO> getMovies() {
		return movies;
	}
	public void setMovies(Set<MovieDO> movies) {
		this.movies = movies;
	}
	
	@Override
	public String toString() {
		return "MovieLists [id=" + id + ", movies=" + movies + "]";
	}
	
	
	
}
