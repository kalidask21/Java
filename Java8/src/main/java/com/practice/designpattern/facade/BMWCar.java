package com.practice.designpattern.facade;

public class BMWCar implements ICar{

	@Override
	public void speed() {
	   System.out.println("Top speed is"+200);
		
	}

	@Override
	public void make() {
		System.out.println("BMW Autos");
		
	}

	@Override
	public void country() {
		System.out.println("Germany");
		
	}

}
