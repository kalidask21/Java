package com.cms.cmsserviceapi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.jboss.logging.Logger;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FacilityResourceTest {

	private final Logger log = Logger.getLogger(getClass().getName());
	
	@Test
    public void getFacilities() {
		String accessToken = "test";// Right now its empty
        final Response resourceServerResponse = RestAssured.given().header("Authorization", "Bearer " + accessToken).get("http://localhost:9091/cms-unsecured-dataapi/facilities");
        
        assertThat(resourceServerResponse.getStatusCode(),equalTo(200));
        log.info("Response  : "+ resourceServerResponse.getBody().prettyPrint());
    }
	
	
	@Test
    public void getFacilityById() {
		String accessToken = "test";// Right now its empty
        final Response resourceServerResponse = RestAssured.given().header("Authorization", "Bearer " + accessToken).get("http://localhost:9091/cms-unsecured-dataapi/facility/FacilityId0"); 
        assertThat(resourceServerResponse.getStatusCode(),equalTo(200));
        log.info("Response  : "+ resourceServerResponse.getBody().prettyPrint());
    }


    
}
