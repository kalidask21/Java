package com.source.dictionaryservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.source.dictionaryservice.model.DictionaryModel;
import com.source.dictionaryservice.service.DictionaryServiceImpl;

@RestController
public class DictionaryController {

	@Autowired
	private DictionaryServiceImpl dictService;
	
	@GetMapping("/words")
	public ResponseEntity<List<DictionaryModel>> getWords(){
		if(dictService.getWords().isEmpty())
			return new ResponseEntity<List<DictionaryModel>>(new ArrayList<DictionaryModel>(),HttpStatus.OK);
		else
			return new ResponseEntity<List<DictionaryModel>>(dictService.getWords(),HttpStatus.OK);
	}
	
	
	@GetMapping("/word/search/{sWord}")
	public ResponseEntity<List<DictionaryModel>> searchWord(@PathVariable("sWord") String sWord){
		if(sWord.length()<2)
			return new ResponseEntity<List<DictionaryModel>>(new ArrayList<DictionaryModel>(),HttpStatus.OK);
		else
			return new ResponseEntity<List<DictionaryModel>>(dictService.findWord(sWord),HttpStatus.OK);
	}
}
