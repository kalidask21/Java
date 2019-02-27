package com.practice.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerRunnable implements Runnable {

	private AtomicInteger atmInt = null;

	AtomicIntegerRunnable(AtomicInteger atmIntParam) {
		this.atmInt = atmIntParam;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (atmInt.get() < 50) {
			synchronized (atmInt) {
				if(atmInt.get() < 50) {
					atmInt.getAndAdd(1);
					System.out.println("Thread info "+Thread.currentThread().getName() +" Value is " +  atmInt.get());
				}
			}
		}

	}

}
