package com.practice.algorithm.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HackerRankPractoce {

	static void token(String s) {
		String delim = "[ .,?!']+";
		String[] splitted = s.split(delim);
		System.out.println(splitted.length);
		for(String sp :splitted) {
		    if(sp.trim().length()>0)
		    	System.out.println(sp);
		}
	}
	
	static int findPairofArray(int[] arr) {
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				count++;
				set.remove(arr[i]);
			}
		}
		return count;
	}

    static boolean isAnagram(String a, String b) {
	     if(a.length() != b.length()) {
	    	 return false;
	     }
	     List<String> wordsListA = new ArrayList<>();
	     char[] wordsA =a.toLowerCase().toCharArray();
	     char[] wordsB =b.toLowerCase().toCharArray();
		
	     for(char c : wordsA)
	    	 wordsListA.add(String.valueOf(c));
	     
	     for(char c2 :wordsB) {
	    	 if(wordsListA.contains(String.valueOf(c2))) {
	    		 wordsListA.remove(String.valueOf(c2));
	    	 }
	     }
	     
	     wordsListA.forEach(System.out::println);
	     
	     return wordsListA.isEmpty();
	     
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,4,5,6,7};
		List<String> list = Arrays.asList("Kalidas","Kanniappan");
		list.replaceAll(String::toUpperCase);
		list.forEach(System.out::println);
		
		//System.out.println(findPairofArray(arr));
		
		//System.out.println(isAnagram("kaali","aliak"));
		token("           YES      leading spaces        are valid,    problemsetters are         evillllll");
	}
	
}
