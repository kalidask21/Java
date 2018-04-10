package com.practice.designpattern.decorator;

public class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
	}
	
	@Override
	public void speed(){
		super.speed();
		System.out.print(" Adding features of Sports Car.");
	}

}
