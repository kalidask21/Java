package com.practice;

public class GFG 
{
    static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int[] count = new int[ASCII_SIZE];
        StringBuffer sbf = new StringBuffer();
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        
        
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
        	System.out.println(str.charAt(i) + " - " + count[str.charAt(i)]);
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        
     // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
             if(count[str.charAt(i)] == 1) {
            	sbf.append(str.charAt(i));
            }
        }
      
        System.out.println(sbf.toString().length());
        return result;
    }
     
    // Driver Method
    public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("Max occurring character is " +
                            getMaxOccuringChar(str));
    }
}