package com.practice.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class AtomicIntegerRunnable implements Runnable {

	private AtomicInteger atmInt = null;
	private static Lock atomicLock = new ReentrantLock();

	AtomicIntegerRunnable(AtomicInteger atmIntParam) {
		this.atmInt = atmIntParam;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (atmInt.get() < 50) {
			// Using Synchronzed Lock. // Make sure orders
			/*synchronized (atmInt) {
				if(atmInt.get() < 50) {
					atmInt.getAndAdd(1);
					System.out.println("Thread info "+Thread.currentThread().getName() +" Value is " +  atmInt.get());
				}
			}*/
			if(atmInt.get() < 50) {
				atomicLock.lock();
				atmInt.getAndAdd(1);
				System.out.println("Thread info "+Thread.currentThread().getName() +" Value is " +  atmInt.get());
				atomicLock.unlock();
			}
			//
		}

	}

}
