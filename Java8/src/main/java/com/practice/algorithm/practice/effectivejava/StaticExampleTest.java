package com.practice.algorithm.practice.effectivejava;

public class StaticExampleTest {

	private static StaticExampleTest staticExampleTestObj = new StaticExampleTest();
	
	
	private StaticExampleTest() {
	}
	public int calcAdd(int i,int j) {
		return i+j;
	}
	public static StaticExampleTest getInstance() {
		if(null == staticExampleTestObj) {
			return new StaticExampleTest();
		}
		
		return staticExampleTestObj;
	}
	
	
	public static void main(String[] args) {
		
		StaticExampleTest  obj1 = StaticExampleTest.getInstance();
		
		System.out.println(obj1.calcAdd(4, 4));
		System.out.println(obj1.calcAdd(4, 5));
	}
	
}
