package com.practice.java8;

import java.util.function.Predicate;
import java.util.function.Supplier;

import com.practice.algorithm.practice.CarClass;
import com.practice.algorithm.practice.SingletonEnum;

public class FunctionInterfaceTest {
	
	private static Supplier<CarClass> singleTonSupplier = () -> SingletonEnum.getCarClassInstance();	
	private static Supplier<StringBuffer> stringBufferSupplier = () -> new StringBuffer();
	private static Predicate<String> predicate1 = (str) -> str.contains("Kalidas");
	private static Predicate<String> predicate2 = (str) -> str.contains("Kali");
	private static Predicate<String> predicate3 = (str) -> str.contains("KalidasKanniappan");
	
	public static void main(String[] args) {
		
		singleTonSupplier.get().printCar("BMW 1");
		singleTonSupplier.get().printCar("BMW 2");	
		
		System.out.println(stringBufferSupplier.get().append("Hi1111").toString());
		
		System.out.println(predicate1.and(predicate2).and(predicate3).test("Kali"));
		System.out.println(predicate1.or(predicate2).or(predicate3).test("Kanniappan"));
		
	}
	
}
