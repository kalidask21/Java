package com.source.financeservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.source.dictionaryservice.config.SpringApp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringApp.class)
@WebAppConfiguration
public class TransactionTestClass {

	protected MockMvc mockMvc;
	
	@Autowired
	WebApplicationContext webApplicationContext;
	
	
	@Before
	protected void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
	}
	
	
	@Test
	public void testAppRunning() throws Exception {
		String uri = "/hello";
		//MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(uri));
		//assertEquals(200, mvcResult.getResponse().getStatus());
		
	}
	
	
	
}
