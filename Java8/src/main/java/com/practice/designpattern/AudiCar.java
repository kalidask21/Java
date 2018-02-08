package com.practice.designpattern;

public class AudiCar extends CarAbstract {

	@Override
	protected void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("Audi Car starts");
		
	}

	@Override
	protected void pedalGas() {
		// TODO Auto-generated method stub
		System.out.println("Audi Car started to Move");
	}

	@Override
	protected void currentSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Audi Car speeds at 100mph");
	}

}
