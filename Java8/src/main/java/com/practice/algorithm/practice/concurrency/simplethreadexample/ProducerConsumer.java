package com.practice.algorithm.practice.concurrency.simplethreadexample;

import java.util.LinkedList;

public class ProducerConsumer {

	LinkedList<Integer> list = new LinkedList<>();
	int MAX_CAP = 10;

	public void produce() {
		int value=0;
		while (true) {
			synchronized (this) {
				try {
                     while(list.size() == MAX_CAP) {
                    	 wait();
                     }
                     System.out.println(Thread.currentThread().getName());
                     System.out.println("Prodcued Value is "+value);
                     list.add(value++);
                     
                     notify();
                     
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	};

	public void consumer() {
            try {
				while(true) {
					synchronized(this) {
						while(list.size() ==0) {
							wait();
						}
						System.out.println(Thread.currentThread().getName());
						System.out.println("Consumed : "+list.removeFirst());
						notify();
						Thread.sleep(1000);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
	};
}
