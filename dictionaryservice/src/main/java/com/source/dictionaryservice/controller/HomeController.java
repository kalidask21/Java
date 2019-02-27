package com.source.dictionaryservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/hello")
	@ResponseStatus(code=HttpStatus.OK)
	public ResponseEntity<String> hello() {
	    return new ResponseEntity<>("Hello !, Server is up and running ", HttpStatus.OK);
	}
	
	
	@GetMapping("/hello/{message}")
	@ResponseStatus(code=HttpStatus.OK)
	public ResponseEntity<String> customHello(@PathVariable("message") String message) {
		if(message.length()<2) {
			throw new StringIndexOutOfBoundsException();
		}	
		
	    return new ResponseEntity<>("Your custom message is here  : - "+message, HttpStatus.OK);
	}	
	
	@ExceptionHandler(value=StringIndexOutOfBoundsException.class)
	public ResponseEntity<String> invalidMessage(){
		return new ResponseEntity<>("Invalid Message ",HttpStatus.BAD_REQUEST);
	}	
	
}
