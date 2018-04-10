package com.practice;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringClass {

	
	private static String SortString(String input) {
		char[] stringArray = input.toCharArray();
		Arrays.sort(stringArray);
		String s1 = new String(stringArray).toLowerCase();
		System.out.println(s1);
		return s1;
	}
	
	private static void isAnagram(String s1,String s2) {
		if(s1.equals(s2))
			System.out.println("Its Anagaram");
		else
			System.out.println("Its not anagram");
	}
	
	
	public static void main(String[] args) {
		System.out.println();
		
		String s1 = SortString("kalidas");
		String s2 = SortString("kalsida");
		//isAnagram(s1,s2);
		
		removeUnderScore("Kalidas_Kanniappan_MR");
		String val = null;
		val = "test";
		System.out.println(isEmpty(val));
	}
	
	
	public static String removeUnderScore(String s) {
		StringBuffer sbf = new StringBuffer();
		StringTokenizer strToke = new StringTokenizer(s, "_");
		int count  = -1;
		while(strToke.hasMoreTokens()) {
			sbf.append(" ");
			sbf.append(strToke.nextToken());
			count++;
		}
		System.out.println("UnderScore count is "+count);
		System.out.println("removeunderScore : "+sbf.toString());
		return sbf.toString();
		
	}
	
	 public static boolean isEmpty(final CharSequence cs) {
	        return cs == null || cs.length() == 0;
	 }

	
	
}
