package com.source.dictionaryservice.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.source.dictionaryservice.model.DictionaryModel;

@Service
public class DictionaryMockData {

	public List<DictionaryModel> getMockWords() {
		List<DictionaryModel> dicModel = new ArrayList<DictionaryModel>();
		dicModel.add(new DictionaryModel("Awesome", "breathtaking,amazing,", new String[]{"extremely good","excellent"}));
		return dicModel;
	}
	
}
