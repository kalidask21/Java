package com.practice.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterQueue {

	private Lock locker = new ReentrantLock();
	
	public void printJob(String message) {
		locker.lock();
		System.out.println("Printing   " + message);
	//	locker.unlock();
		
	}
}
