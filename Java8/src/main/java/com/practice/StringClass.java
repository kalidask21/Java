package com.practice;

import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

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
		isAnagram(s1,s2);
	}
	
}
