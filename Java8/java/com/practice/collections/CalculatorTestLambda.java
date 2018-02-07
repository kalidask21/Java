package com.practice.collections;

public class CalculatorTestLambda {

	public static void main(String[] args) {
		
		ICalculator add = (a,b) ->{
			return a+b;
		};
		ICalculator sub = (a,b) -> {
			if(a <0 || b<0) {
				throw new NumberFormatException();
			}
			return a-b;
		};
		ICalculator multi = (a,b) -> a * b;
		
		System.out.println(add.calculate(4,6));
		System.out.println(sub.calculate(4,-6));
		System.out.println(multi.calculate(4,6));
	}
}
