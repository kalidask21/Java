package com.practice.algorithm.practice;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonEnum.getCarClassInstance().printCar("BMW");
		SingletonEnum.getCarClassInstance().printCar("BMW Z3");
		SingletonEnum.getCarClassInstance().printCar("BMW X1");
		SingletonEnum.getCarClassInstance().printCar("BMW X2");
		SingletonEnum.getCarClassInstance().printCar("BMW X3");
	}
	
}
