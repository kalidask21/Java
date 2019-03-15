package com.practice.pluralsightvideo.java8practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

	public static void main(String[] args) {
		
		List<String> validPerson = new ArrayList<>();
		
		Stream<String> persons = Stream.of("Kalidas","Balaji","Jon","Brook","Ryan","Brook");
		
//		persons.filter(s -> s.length() >2)
//		    .map( name -> name.toUpperCase())
//		    .forEach( name ->{
//			// System.out.println(" Name :" +name);
//		    validPerson.add(name);	
//		});
//		
		//validPerson.forEach(name -> System.out.println(name));
		
		Optional<String> l1 = persons.collect(Collectors.minBy(Comparator.comparing(val -> val)));
		 System.out.println(l1);
		//persons.collect(Collectors.toList());
		//Set<String> s1 = persons.collect(Collectors.toSet());
		//System.out.println(persons.collect(Collectors.maxBy(Comparator.comparing(val -> val))));
		//System.out.println(persons.collect(Collectors.joining("-")));
		
		//System.out.println("L1");
		//l1.forEach(System.out::println);
		
		System.out.println("S1");
		//s1.forEach(System.out::println);
		
		
		
	}
}
