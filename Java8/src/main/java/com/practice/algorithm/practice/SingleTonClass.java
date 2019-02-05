package com.practice.algorithm.practice;

public class SingleTonClass {

	private static SingleTonClass singleTonClass = null;
	
	private SingleTonClass() {
		
	}
	public static SingleTonClass getInstance() {
		synchronized (SingleTonClass.class) {
			if(null == singleTonClass)
				singleTonClass = new SingleTonClass();
		}
				
		return singleTonClass;
	}
	
	public static void main(String[] args) {
		System.out.println(SingleTonClass.getInstance());
		System.out.println(SingleTonClass.getInstance());
		
	}
}
