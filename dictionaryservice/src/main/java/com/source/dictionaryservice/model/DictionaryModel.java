package com.source.dictionaryservice.model;

public class DictionaryModel {

	private String word;
	private String synonyms;
	private String[] examples;
	
	public DictionaryModel(String word, String noun, String[] examples) {
		super();
		this.word = word;
		this.synonyms = noun;
		this.examples = examples;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getNoun() {
		return synonyms;
	}
	public void setNoun(String noun) {
		this.synonyms = noun;
	}
	public String[] getExamples() {
		return examples;
	}
	public void setExamples(String[] examples) {
		this.examples = examples;
	}
	
	
	
}
