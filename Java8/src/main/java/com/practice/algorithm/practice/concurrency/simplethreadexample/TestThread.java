package com.practice.algorithm.practice.concurrency.simplethreadexample;

import java.util.ArrayList;
import java.util.List;

public class TestThread {

	public static void main(String[] args) {

		/*	List<Order> orders = new ArrayList<Order>();
			orders.add(new Order("Pizza", 1));
			orders.add(new Order("Coffee", 2));
			orders.add(new Order("Burger", 3));
			orders.add(new Order("Veg Burger", 4));
			orders.add(new Order("NV Burger", 5));

			Server1 servRun1 = new Server1(orders);
			//Server2 servRun2 = new Server2(orders);

			Thread th1 = new Thread(servRun1,"Server1");
			//Thread th2 = new Thread(servRun2,"Server2");

			th1.start();
		//	th2.start();
			//th2.join();
			//th1.join();
			 * 
			 * 
			 * 
*/		
		
		ProducerConsumer pc = new ProducerConsumer();
		
		Runnable r1  = () ->{
			pc.produce();
		};
		
		Runnable r2  = () ->{
			pc.consumer();
		};
		
		
		Thread th1 = new Thread(r1,"R1");
		Thread th2 = new Thread(r2,"R2");
		
		th1.start();
		th2.start();
		
	}
}
