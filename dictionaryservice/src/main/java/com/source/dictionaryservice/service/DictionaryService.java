package com.source.dictionaryservice.service;

import java.util.List;

import com.source.dictionaryservice.model.DictionaryModel;

public interface DictionaryService {
     
	List<DictionaryModel> getWords();
	
	List<DictionaryModel> findWord(String searchWord);
}
