package com.practice.designpattern.decorator;

public class BasicCar implements Car{

	@Override
	public void speed() {
		 System.out.println("Speed is 30 mph");
	}

	@Override
	public void cost() {
		System.out.println("cost is 10grand");
		
	}

}
