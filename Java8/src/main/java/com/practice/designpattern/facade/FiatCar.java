package com.practice.designpattern.facade;

public class FiatCar implements ICar{

	@Override
	public void speed() {
		 System.out.println("Top speed is"+50);
		
	}

	@Override
	public void make() {
		 System.out.println("FIAT Manufactures");
		
	}

	@Override
	public void country() {
		 System.out.println("France");
		
	}

}
