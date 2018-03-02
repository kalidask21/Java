package com.practice.designpattern.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		
		VoltAdapter volt = new VoltAdapterImpl();
		
		System.out.println(volt.getFanVolt());
		System.out.println(volt.getMobileVolt());
		System.out.println(volt.getPCVolt());
		System.out.println(volt.getTVVolt());
		
	}
}
