package com.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {

	private static boolean digit5Max(String in) {
		String DIGIT_21 = "\\d{5}";
	    return in.matches(DIGIT_21);
	}
	
	
	private static boolean twoDecimalPointMatch(String in) {
		String DIGIT_21 = "^\\d+(\\.\\d+)?+(\\.\\d+)?";
	    return in.matches(DIGIT_21);
	}
	
	private static boolean endsWithing(String in) {
		String DIGIT_21 = ".*ing";
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
	
	public static final String EXAMPLE_TEST = "This is my small for example string for which I'm going to use for pattern matching.";
	
	public static void main(String[] args) {
		//System.out.println(digit5Max("12213"));
		//System.out.println(phoneNo("973 944 9797"));
		//System.out.println(findCountofAppearnce("KALIDAS"));
		//findtext("AAAABBBBABABABABABA","BA");
		//System.out.println(endsWithing("interesting"));
		//System.out.println(endsWithing("interested"));
		
		
		Pattern pattern = Pattern.compile("BA");
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("AAAABBBBABABABABABA");//(EXAMPLE_TEST);
        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
		
	}
}
