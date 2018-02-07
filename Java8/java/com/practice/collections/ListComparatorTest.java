package com.practice.collections;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparatorTest {

	private List<String> countries=CountryConstants.getCountries();

	private static long countofCty() {
		return CountryConstants.getCountries().stream().count();
	}
	
	
	private void sortUsing7(){
		Collections.sort(countries,new Comparator<String>() {
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.toString().compareTo(o2);
			}
			
		});
	}
	
	private void sortUsing8(){
		Collections.sort(countries,(o1,o2) -> o1.toString().compareTo(o2));
		
	}
	
	private void print(){
		System.out.println(" Countries");
		countries.forEach(v ->{
			System.out.println(v);
		});
		
	}
	
	public static void main(String[] args) {
		ListComparatorTest listObj = new ListComparatorTest();
		System.out.println(MessageFormat.format("Country count is {0}",ListComparatorTest.countofCty()));
		
		//System.out.println("Sort using Java 7 syntax: ");
		//listObj.sortUsing7();
		//listObj.print();
		
		
		System.out.println("Sort using Java 8 syntax: ");
		//listObj.sortUsing8();
		listObj.print();
	}
}
