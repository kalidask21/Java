package com.source.dictionaryservice.model;

import java.util.List;

public class MovieDO {

	public String movieName;
	public String movieyear;
	public String movielanguage;
	private List<String> cast;
    private List<String> genre;
	
	

	public MovieDO(String movieName, String movieyear, String movielanguage, List<String> cast, List<String> genre) {
		super();
		this.movieName = movieName;
		this.movieyear = movieyear;
		this.movielanguage = movielanguage;
		this.cast = cast;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDO [movieName=" + movieName + ", movieyear=" + movieyear + ", movielanguage=" + movielanguage
				+ ", cast=" + cast + ", genre=" + genre + "]";
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieyear() {
		return movieyear;
	}

	public void setMovieyear(String movieyear) {
		this.movieyear = movieyear;
	}

	public String getMovielanguage() {
		return movielanguage;
	}

	public void setMovielanguage(String movielanguage) {
		this.movielanguage = movielanguage;
	}


}
