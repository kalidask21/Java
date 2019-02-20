package com.practice.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTester {

	public static void main(String[] args) throws InterruptedException {
		Queue<String> inputMess = new LinkedList<>();
		inputMess.add("A1");
		inputMess.add("A2");
		inputMess.add("A3");
		inputMess.add("A4");
		
	
		
		
	    ExecutorService executor = Executors.newFixedThreadPool(3);
		 executor.execute(new Task1(inputMess));
		 executor.execute(new Task1(inputMess));
	
	     executor.shutdown();
	/*	
		Thread th1 = new Thread(new Task1(inputMess),"TH1");
		Thread th2 = new Thread(new Task1(inputMess),"TH2");
		
		th1.start();
		th2.join();
		th2.start();
		th1.join();*/
		

	}
	
	
	
}
