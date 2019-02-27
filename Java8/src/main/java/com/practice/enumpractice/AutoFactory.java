package com.practice.enumpractice;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AutoFactory {

	enum AUTO_TYPE{ CAR, BIKE, CYCLE; }
	
	public static void main(String[] args) {
		
		Map<AutoFactory.AUTO_TYPE , Set<String>> mapList = new EnumMap<>(AutoFactory.AUTO_TYPE.class);
		
		Set<String> cars = new HashSet<>();
		cars.add("BMW");
		cars.add("AUDI");
		
		Set<String> bike = new HashSet<>();
		bike.add("HONDA BIKE");
		bike.add("YAMAHA");
		
		mapList.put(AUTO_TYPE.CAR,cars);
		mapList.put(AUTO_TYPE.BIKE,bike);
		
		
		//System.out.println(mapList.get(AutoFactory.AUTO_TYPE.CAR));
		//System.out.println(mapList.get(AutoFactory.AUTO_TYPE.BIKE));
		

		
	}
}
