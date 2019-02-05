package com.practice.algorithm.practice.concurrency;

public class ThreadSimpleTry {

	public static void main(String[] args) {
		
	    
		
		
		
		Runnable run1 = () ->{
			System.out.println("Thread 1 is running "+Thread.currentThread());
		};
		
		Runnable run2 = () ->{
			System.out.println("Thread 2 is running "+Thread.currentThread());
		};
		
		
		Thread th1 = new Thread(run1);
		Thread th2 = new Thread(run2);
		
		th1.start();
		th2.start();
	}
	
	
}
