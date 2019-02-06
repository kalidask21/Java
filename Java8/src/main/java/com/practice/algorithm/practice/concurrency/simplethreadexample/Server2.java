package com.practice.algorithm.practice.concurrency.simplethreadexample;

import java.util.List;

public class Server2 implements Runnable{

	private List<Order> orders = null;
	
	public Server2(List<Order> inOrders) {
		// TODO Auto-generated constructor stub
		this.orders = inOrders;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!orders.isEmpty()) {
			synchronized (orders) {
				try {
					System.out.println("Proccesed order Below : ");
					System.out.println(Thread.currentThread().getName());
					System.out.println(orders.get(0).getOrderName());
					orders.remove(0);
					orders.wait();
					return;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		orders.notifyAll();
		
	}

}
