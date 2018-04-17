package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {

	private static boolean digit5Max(String in) {
		String DIGIT_21 = "\\d{5}";
	    return in.matches(DIGIT_21);
	}
	
	
	private static boolean phoneNo(String in) {
		String DIGIT_21 = "^\\d{3}?[-.\\s]\\d{3}[-.\\s]\\d{4}";
	    return in.matches(DIGIT_21);
	}
	
	private static boolean findCountofAppearnce(String in) {
		String regex = "^[A-Z]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(in);
		return matcher.matches();
	}
	
	private static void findtext(String in,String in2) {
		int len =in2.length();
		int inLen = in.length();
		int i = 0;
		int count = 0;
		while(i<inLen-1) {
			System.out.println(in.substring(i,len+i));
			if(in.substring(i,len+i).equals(in2))
			  count++;
			i++;
		}
		
		System.out.println("HOW MANY TIME PRESENT "+count);
	}
	
	
	public static void main(String[] args) {
		//System.out.println(digit5Max("12213"));
		//System.out.println(phoneNo("973 944 9797"));
		//System.out.println(findCountofAppearnce("kalidas"));
		findtext("AAAABBBBABABABABABA","BA");
	}
}
