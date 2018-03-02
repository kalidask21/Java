package com.practice.designpattern.facade;

public class FacadeTester {

	public static void main(String[] args) {
		
		FacadeHelper facHelper = new FacadeHelper();
		ICar carObj = facHelper.getCar("BMW");
		carObj.speed();
		carObj.make();
		carObj.country();
		
		carObj = facHelper.getCar("FIAT");
		carObj.speed();
		carObj.make();
		carObj.country();
		
	}
}
