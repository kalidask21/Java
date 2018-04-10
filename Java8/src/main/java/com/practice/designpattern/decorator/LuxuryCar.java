package com.practice.designpattern.decorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void speed(){
		super.speed();
		System.out.println(" /n Luxury car , is extra 40 mph");
	}

}
