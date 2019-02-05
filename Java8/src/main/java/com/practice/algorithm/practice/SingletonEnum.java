package com.practice.algorithm.practice;

public enum SingletonEnum {

	INSTANCE;
	private CarClass carClassObj = null;
	
	private SingletonEnum(){
		carClassObj = new CarClass();
	}
	
    public static CarClass getCarClassInstance() {
    	return INSTANCE.carClassObj;
    }
}
