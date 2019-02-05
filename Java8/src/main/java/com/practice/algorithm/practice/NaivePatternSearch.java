package com.practice.algorithm.practice;

//Java program for Naive Pattern Searching
public class NaivePatternSearch {

 public static void search(String txt, String pat)
 {
     int pattLen = pat.length();
     int textLen = txt.length();
     
     if(pattLen > textLen)
    	 System.out.println("Invalid inputs");
     
     for(int i=0; i<textLen-pattLen;i++) {
    	 int j;
    	 for(j=0;j<pattLen;j++) {
    		 if(pat.charAt(j) != txt.charAt(i+j)) {
    			 break;
    		 }
    	 }
    	 if(pattLen == j)
    		 System.out.println("Found at "+i);
    	 
    	 
     }
	 
 }

 public static void main(String[] args)
 {
     String txt = "AABAACAADAABCAABAA";
     String pat = "AABA";
     search(txt, pat);
 }
}