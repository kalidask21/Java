package com.practice.pluralsightvideo.java8practice;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		Optional<String> op1 = Optional.empty();
		Optional<String> op2 = Optional.of("Test");
		Optional<String> op3 = Optional.ofNullable(null); ///of(null);
		
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		
	}
}
