package com.practice.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);
		
		//Function<Map<String, Integer>,Map<String, Integer>> fn = ;
		
		Map<String, Integer> FilteredMap =  unsortMap.
		   entrySet()
		   .stream().map(Function.identity()).
		   filter(obj -> obj.getValue() < 10).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

	//	FilteredMap.forEach((k,v) -> System.out.println(k + " -" +  v));
		
		Function<Integer,Integer> addOne = val -> val + 1;
		Function<Integer,Integer> multiply3 = val -> val * 3;
		
		System.out.println(" Function ouput is " +addOne.andThen(multiply3).apply(2));
		
		Predicate<String> isLenGreaterThan2 = val -> val.length() > 2; 
		System.out.println(" Predicate 1  ouput is " +isLenGreaterThan2.test("Kalidas"));
		System.out.println(" Predicate 2  ouput is " +isLenGreaterThan2.test("Ks"));
		
		Supplier<String> sup  = () -> "Kalidas From Supplier";
		
		Optional<String> optionalVal = Optional.empty();//of("Kalidas");
		//System.out.println(" Optional 2  ouput is " +optionalVal.get());
		//System.out.println(" Optional 2  ouput is " +optionalVal.isPresent());
		System.out.println(" Optional 2  ouput is " +optionalVal.orElseGet(sup));
		
		
		
		
	}
}
