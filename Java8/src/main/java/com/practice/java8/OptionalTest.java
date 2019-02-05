package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> strOpt = Optional.empty();
		//System.out.println(strOpt.isPresent());
		//System.out.println(strOpt);
		
		strOpt = Optional.of("Hey Option");
		//System.out.println(strOpt.isPresent());
		//System.out.println(strOpt);

		strOpt = Optional.ofNullable(null);
		//System.out.println(strOpt.isPresent());
		//System.out.println(strOpt);
		
		String OptionString = (String) Optional.ofNullable(null).orElse("Hey I am not null");
		//System.out.println(OptionString);
		
		
		String text = "Hi Today its Tuesday";
		
		System.out.println("Using orElseGet:");
	    String defaultText = 
	      Optional.ofNullable(text).orElseGet(OptionalTest::getMyDefault);
	    System.out.println("Default Value is " + defaultText);
	 
	    System.out.println("Using orElse:");
	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    System.out.println("Default Value is " + defaultText);
	    
	    
	    System.out.println("Using orElso Throw:");
	    defaultText = Optional.ofNullable(text).orElseThrow(NullPointerException::new);
	    System.out.println("Default Value is " + defaultText);
	    
	    System.out.println("Covert to String  " + Optional.ofNullable(text).get());
	    
	    
	    System.out.println("Day Check "+ Optional.ofNullable(text).filter(val -> val.contains("Tuesday")).isPresent());
	    
	    System.out.println("Monday is weekday "+checkDateWeekend("FRI"));
	    
	    System.out.println("Sunday is weekday "+checkDateWeekend("SUN"));
	    
	    List<String> companyNames = Arrays.asList(
	    	      "paypal", "oracle", "", "microsoft", "", "apple");
	    
	    System.out.println(checkCompanyList(companyNames));
	}
	
	public static String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}

	public static boolean checkDateWeekend(String day) {
		
		Optional<String> optDay = Optional.ofNullable(day);
		return optDay.filter(val-> "MON,TUE,WED,THU,FRI".contains(day)).isPresent();
		
	}
	
	public static List<String> checkCompanyList(List<String> companyNames) {
		Optional<List<String>> optDay = Optional.of(companyNames);
		return optDay.filter(vals-> vals.contains("oracle")).get();
	}
	
	
	
	
}
