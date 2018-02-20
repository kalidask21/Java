
package com.practice.others;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexFormatter {

	
	public static boolean isValidPhoneFormat(String phoneNo){
		String pattern = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
	    return phoneNo.matches(pattern);
	}	
	public static boolean isTrue(String input){
	    return input.matches("true");
	}
	
	public static int coundWordFromParagraph(String paragraph){
		Pattern patternObj = Pattern.compile("ele");
		Matcher matcherObj = patternObj.matcher(paragraph);
		int count = 0;
		while(matcherObj.find())
			count++;
		
		return count;
		
	}
	
	public static boolean isTrueorFalse(String input){
	    return input.matches("true|false");
	}
	
	public static boolean isTrueNonCase(String input){
	    return input.matches("[tT]rue");
	}
	
	public static boolean isContains(String input){
	    return input.matches(".*kali.*|.*KALI.*");
	}
	
	
}
