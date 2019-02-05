package com.practice.algorithm.practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class PositiveAndNegative {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=s.nextInt();
		    }
		    int pos1=-1;
		    int neg1=-1;
		    int[] pos=new int[arr.length/2];
		    int[] neg=new int[arr.length/2];
		    
		    for(int i=0;i<arr.length;i++){
		        if(arr[i]>0){
		            pos1++;
		            pos[pos1]=arr[i];
		            
		        }else{
		            neg1++;
		            neg[neg1]=arr[i];
		        }
		    }
		    for(int i=0;i<arr.length/2;i++){
		        System.out.print(pos[i]+" "+neg[i]+" ");
		    }
		    System.out.println();
		}
	}
}