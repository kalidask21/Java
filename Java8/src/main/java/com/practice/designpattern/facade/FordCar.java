package com.practice.designpattern.facade;

public class FordCar implements ICar {

	@Override
	public void speed() {
		 System.out.println("Top speed is"+150);
		
	}

	@Override
	public void make() {
		 System.out.println("Ford Motors");
		
	}

	@Override
	public void country() {
		 System.out.println("America");
		
	}

}
