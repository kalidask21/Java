package com.practice;

public class LongestIncreasingSubsequence {

	static int LIS(int[] array) {
		
		int out = 1;
		int temp  = array[0];
		for (int i=0;i<array.length;i++) {
			if(array[i]>temp) {
				out++;
				temp=array[i];
			}
		}
		return out;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {4,5,2,20,1,35,0,44,5,99};
		System.out.println("TEST : "+LIS(arr));
	}
}
