package com.practice.algorithm.practice;

public class StringExample {

	
	static void reverseInStringBuffer(String inp) {
		System.out.println(new StringBuffer(inp).reverse());
	}
	
	
	static void reverseChar(String inp) {
		for(int i=inp.length()-1; i >=0 ;i--) {
			System.out.println(inp.charAt(i));
		}
	}
	
	static String recursive(String inp) {
		if(null == inp || (inp.length() <= 1))
			return inp;
					
		return 	recursive(inp.substring(1))	+ inp.charAt(0);	
	}
	
	
	public static void main(String[] args) {
		
		//reverseInStringBuffer("KALIDAS");
		//reverseChar("KALIDAS");
		System.out.println(recursive("KALIDAS"));
		
		
		int noOfRows = 9;
        //Initializing rowCount with 1
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");
        //Implementing the logic
        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++)
            {
                System.out.print("#");
            }
            //Printing 'rowCount' value 'rowCount' times at the end of each row
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
    }
		
}
