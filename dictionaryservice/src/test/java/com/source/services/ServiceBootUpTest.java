package com.source.services;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ServiceBootUpTest {

	private RestTemplate restTemplate = null;
	private static final String URL = "http://localhost:8085/api/v1/service";
	
	
	@Before
	public void setup(){
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void isserver_up_test(){
		ResponseEntity<String> response =  restTemplate.getForEntity(URL +"/hello",String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertTrue(response.getBody().contains(" Server is up and running"));
	}
	
	@Test
	public void isserver_custommessage_test(){
		ResponseEntity<String> response =  restTemplate.getForEntity(URL +"/hello/GoodMorning",String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertTrue(response.getBody().contains("GoodMorning"));
	}
	
	
	@After
	public void tearDown(){
		restTemplate = null;
	}
	
	
}
