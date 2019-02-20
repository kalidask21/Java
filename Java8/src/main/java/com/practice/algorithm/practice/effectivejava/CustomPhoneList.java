package com.practice.algorithm.practice.effectivejava;

import java.util.ArrayList;
import java.util.Objects;

public class CustomPhoneList<PhoneNo> extends ArrayList<PhoneNo>{
	
	public boolean addPhone(Object entity) {
		entity = Objects.requireNonNull(entity);
		return super.add((PhoneNo) entity);
	}
}
