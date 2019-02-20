package com.practice.algorithm.practice.effectivejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	
	public static void main(String[] args) {
		CustomPhoneList<PhoneNo> phones = new CustomPhoneList<PhoneNo>();
		phones.addPhone(new PhoneNo("917", "947", "1234"));
		phones.addPhone(new PhoneNo("917", "937", "0234"));
		phones.addPhone(new PhoneNo("907", "947", "2340"));
		phones.addPhone(null);
		
		Collections.sort(phones);
		
		phones.forEach(val ->{
			System.out.println(val.getFullNumberUSFormat());
		});
		
		
	}
}
