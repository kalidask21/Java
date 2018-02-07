package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CountryConstants {

	private static List<String> countries = new ArrayList<>();
	
	static {
		countries.add("USA");
		countries.add("Mexico");
		countries.add("Spain");
		countries.add("India");
		countries.add("England");
		countries.add("Germany");
		countries.add("Russia");
	}
	
	public static List<String> getCountries() {
		return countries;
	}
}
