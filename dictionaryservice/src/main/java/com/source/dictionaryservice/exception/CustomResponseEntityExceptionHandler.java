package com.source.dictionaryservice.exception;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomResponseEntityExceptionHandler {

	@RequestMapping(produces="application/json")
	@ExceptionHandler(value = { FileNotFoundException.class , IOException.class })
	protected ResponseEntity<String> handleFileIssue(Exception ex) {
		String bodyOfResponse = Optional.of("Something Went Wrong !!!!!").orElse(ex.getMessage());
		return new ResponseEntity<String>(bodyOfResponse, HttpStatus.CONFLICT);
	}

}
