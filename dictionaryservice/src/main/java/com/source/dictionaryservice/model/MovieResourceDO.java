package com.source.dictionaryservice.model;

import java.util.Arrays;

public class MovieResourceDO {
   
	private String title;
    private String year;
    private String[] cast;
    private String[] genre;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = cast;
	}
	public String[] getGenre() {
		return genre;
	}
	public void setGenre(String[] genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "MovieResourceDO [title=" + title + ", year=" + year + ", cast=" + Arrays.toString(cast) + ", genre="
				+ Arrays.toString(genre) + "]";
	}
    
    
}
