package com.practice.pluralsightvideo.java8practice;

public class Words {

	private String word;
	private String meaning;
	
	public Words(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	@Override
	public String toString() {
		return "Words :  [word=" + word + ", meaning=" + meaning + "]";
	}
	
	
	
	
	
}
