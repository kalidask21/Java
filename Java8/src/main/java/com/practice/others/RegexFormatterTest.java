package com.practice.others;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RegexFormatterTest {

	@Before
	public void setUp(){
	}
	
	@Test
	public void testReg(){
		
		Assert.assertTrue(RegexFormatter.isContains("KKKALIAL"));
		Assert.assertFalse(RegexFormatter.isContains("KKKALAL"));
		
		
		Assert.assertEquals(4,RegexFormatter.coundWordFromParagraph("elephanteeeleele ele"));
	}
	
	@After
	public void tearDown(){
	}
	
}
