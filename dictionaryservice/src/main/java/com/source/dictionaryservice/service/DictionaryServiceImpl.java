package com.source.dictionaryservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.dictionaryservice.mock.DictionaryMockData;
import com.source.dictionaryservice.model.DictionaryModel;

@Service
public class DictionaryServiceImpl implements DictionaryService {

	@Autowired
	private DictionaryMockData dictMockData;
	
	
	@Override
	public List<DictionaryModel> getWords() {
		return dictMockData.getMockWords();
	}


	@Override
	public List<DictionaryModel> findWord(String searchWord) {
		return dictMockData.getMockWords().stream().filter((words)->{
			return words.getWord().toLowerCase().contains(searchWord.toLowerCase());
		}).collect(Collectors.toList());
	}

}
