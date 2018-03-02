package com.practice.designpattern.facade;

public class FacadeHelper {

	public ICar getCar(String cartype) {
		ICar car= null;
		if(cartype.contains("BMW")) {
			car = new BMWCar();
		}else if(cartype.contains("FORD")) {
			car = new FordCar();
		}else if(cartype.contains("FIAT")) {
			car = new FiatCar();
		}
		return car;
	}
	
	
}
