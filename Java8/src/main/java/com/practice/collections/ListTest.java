package com.practice.collections;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class ListTest {

	
	private static List<String> countriesList = new ArrayList<String>();
	
	
	static {
		countriesList.add("USA");
		countriesList.add("Mexico");
		countriesList.add("Spain");
		countriesList.add("India");
		countriesList.add("England");
		countriesList.add("Germany");
		countriesList.add("Russia");	
		
	}
	
	private static long countofCty() {
		return countriesList.stream().count();
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(MessageFormat.format("Country count is {0}",ListTest.countofCty()));
		
	}
}
