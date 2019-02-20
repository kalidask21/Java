package com.practice.thread;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Task1 implements Runnable {
	
	Queue<String> messages = new LinkedList<>();
	
	public Task1(Queue<String> inMessages) {
	   this.messages = inMessages;
	}
	

	@Override
	public void run() {
		while(!messages.isEmpty()) {
				System.out.println("Thread "+Thread.currentThread().getName()+" Message is "+messages.remove());
				try {
					messages.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
