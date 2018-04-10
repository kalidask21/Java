package com.practice.designpattern.decorator;

public class CarDecorator implements Car
{
   
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void speed() {
		this.car.speed();
		
	}

	@Override
	public void cost() {
		this.car.cost();
	}

}
