package com.practice.algorithm.practice;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;

public class ArrayExample {

	static void PrintDuplicateArray(int[] inp) {
		for (int i = 0; i < inp.length; i++) {
			for (int j = i + 1; j < inp.length; j++) {
				if (inp[i] == inp[j]) {
					System.out.println("Duplicate is " + inp[i]);
				}
			}
		}
	}

	static void customSort(String[] arr) {
		final String ORDER = "figuecbdavwyxzhjklmnopqrst";

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				System.out.println(" o1 " + ORDER.indexOf(o1.substring(0, 1)));
				System.out.println(" o2 " + ORDER.indexOf(o2.substring(0, 1)));
				return Integer.valueOf(ORDER.indexOf(o1.substring(0, 1)))
						.compareTo(Integer.valueOf(ORDER.indexOf(o2.substring(0, 1))));
			}

		});

		for (String i : arr)
			System.out.println(i);

	}
	
	static void sortMapBykey1(Map input) {
		ArrayList<Integer> sortedKeys = 
                new ArrayList<Integer>(input.keySet()); 
      
		Collections.sort(sortedKeys);
		sortedKeys.forEach(System.out::println);
	
	}

	static void sortMapBykey(Map input) {
		List<Map.Entry<Integer, String>> entries = new ArrayList<>(input.entrySet());
		Collections.sort(entries, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
	}

	static void sortMapByValue(Map input) {
		ArrayList<String> sortedKeys = 
                new ArrayList<String>(input.keySet()); 
      
		Collections.sort(sortedKeys);  

	}

	static void PrintDuplicateHash(int[] inp) {
		Set<Integer> set = new HashSet();
		for (int i = 0; i < inp.length; i++) {
			if (!set.add(inp[i])) {
				System.out.println("Dup is " + inp[i]);
			}
		}
	}

	static int findSecondLargestElement(int[] inp) {
		int firstLar = inp[0];
		int secondLar = inp[1];
		for (int i = 2; i < inp.length; i++) {
			if (inp[i] > firstLar) {
				secondLar = firstLar;
				firstLar = inp[i];
			} else {
				if (inp[i] < firstLar && inp[i] > secondLar) {
					secondLar = inp[i];
				}
			}

		}
		return secondLar;

	}

	static int largestLessNowitjoutGivenDigit(int number, int giveno) {
		char given = Integer.toString(giveno).charAt(0);
		for (int i = number; i > 0; i--) {
			if (Integer.toString(i).indexOf(given) == -1) {
				return i;
			}
		}
		return 0;
	}

	static void commonElementsinArray(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length - 1; i++) {
			int j = i;
			if (IntStream.of(arr2).anyMatch(x -> x == arr1[j])) {
				System.out.println("Duplicate is " + arr1[j]);
			}
		}

	}

	static void pairOfElements(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == val) {
					System.out.println("Combination are  (" + arr[i] + "," + arr[j] + ")");
				}
			}
		}

	}

	static void swapZoerAndone(int[] inp) {
		int count = 0;

		for (int i = 0; i < inp.length; i++) {
			if (inp[i] == 0)
				count++;
		}

		for (int i = 0; i < count; i++) {
			inp[i] = 0;
		}

		for (int i = count; i < inp.length; i++) {
			inp[i] = 1;
		}

		for (int i : inp)
			System.out.println(i);

	}
	
	
	static void removeKtheLargestRemovenArr(Integer[] arr , Integer[] removeArray , int largetNo){
		List<Integer> arrayList = new ArrayList<>();
		arrayList.addAll(Arrays.asList(arr));
		for(Integer a : removeArray) {
			if(arrayList.indexOf(a) != 0) {
				arrayList.remove(arrayList.indexOf(a));
			}
		}
		
		Collections.sort(arrayList,Collections.reverseOrder());
		
		for(int i = 0 ;i <largetNo; i++)
			System.out.println(arrayList.get(i));
		
	}

	static void seggregaEeenAndOdd(int[] inp) {
		int left = 0;
		int right = inp.length - 1;

		while (left < right) {

			while (inp[left] % 2 == 0 && left < right) {
				left++;
			}

			while (inp[right] % 2 > 0 && left < right) {
				right--;
			}

		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 5, 5 };
		// PrintDuplicateArray(arr);
		// PrintDuplicateHash(arr);

		int[] arr1 = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		// System.out.println(findSecondLargestElement(arr1));

		// System.out.println(largestLessNowitjoutGivenDigit(1244,4));

		// commonElementsinArray(arr,arr1);

		int[] inp = { 4, 5, 7, 11, 9, 13, 8, 12 };
		// pairOfElements(inp, 20);

		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		Integer i3 = 128;
		Integer i4 = 128;
		// System.out.println(i3 == i4);

		int[] swapIN = { 0, 1, 0, 1, 0 };
		// swapZoerAndone(swapIN);

		String[] s1 = { "geeksforgeeks", "is" };
		// customSort(s1);

		// Map Sorting
		HashMap<Integer, String> map = new HashMap<>();
		map.put(55, "John");
		map.put(22, "Apple");
		map.put(66, "Earl");
		map.put(77, "Pearl");
		map.put(12, "George");
		map.put(6, "Rocky");
		
	
		sortMapByValue(map);
	
		Integer[] arr3 = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		Integer[] arr4 = { 1, 3, 5, 6, 7, 8};
		int  kth= 3;
		removeKtheLargestRemovenArr(arr3,arr4,kth);

	}

}
