package com.practice.others;

import java.text.MessageFormat;




public class MessageFormatting {
	
	public static void main(String[] args) {
		
		System.out.println(MessageFormat.format("Hey {0} how are you","Kalidas"));
		System.out.println(String.format("Hey %s how are you","Kalidas"));
		
		
		int x = 1;
		for (int i = 0; i < 3; i++) {
		  x += 5 * i;
		}
		System.out.println(x);
	}
}
