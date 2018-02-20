package com.practice.others;
import java.util.HashMap;
import java.util.Map;



public class SortingClass {

	public static String findFirstDuplicateOccurence(String[] input){
		String output = "N/A";
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
			   if(input[i] == input[j]){
				  output = input[i];
			      return output;
			   }   
			}
		}
		return output;
	}
	
	public static Map<String,Integer> findMaxOccurence(String[] input){
		Map<String,Integer> hm = new HashMap<String,Integer>();
		for(int i=0;i<input.length;i++)
		{
			if(hm.containsKey(input[i])){
				hm.put(input[i],hm.get(input[i])+1);
			}else{
				hm.put(input[i],1);	
			}
			
		}
		return hm;
	}
	
	public static void main(String[] args) {
		String[] in = {"A1","A1","B","B"};
		System.out.println(findFirstDuplicateOccurence(in));
		System.out.println(findMaxOccurence(in));
	}
	
}
