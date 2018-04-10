package com.practice.designpattern.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		Car basicCar = new BasicCar();
		//basicCar.speed();
		SportsCar sportsCar = new SportsCar(basicCar);
		//sportsCar.speed();
		
		LuxuryCar luxCar = new LuxuryCar(sportsCar);
		luxCar.speed();
		
	}
}
