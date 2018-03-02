package com.practice.designpattern.adapter;

public class VoltGeneralAdapter {

	public Volts getVolts() {
		return new Volts(220);
	}
	
}
