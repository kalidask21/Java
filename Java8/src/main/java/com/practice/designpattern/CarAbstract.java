package com.practice.designpattern;

public abstract class CarAbstract {

	protected CarAbstract() {
		engineStart();
		pedalGas();
		currentSpeed();
	}
	
	protected abstract void engineStart();
	
	protected abstract void pedalGas();
	
	protected abstract void currentSpeed();
}

