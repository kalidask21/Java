package com.practice.designpattern;

public class BMWCar extends CarAbstract {

	@Override
	protected void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("BMW Car starts");
		
	}

	@Override
	protected void pedalGas() {
		// TODO Auto-generated method stub
		System.out.println("BMW Car started to Move");
	}

	@Override
	protected void currentSpeed() {
		// TODO Auto-generated method stub
		System.out.println("BMW Car speeds at 100mph");
	}

}
