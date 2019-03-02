package com.practice.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

	public static void main(String[] args) {
		
		AtomicInteger atm = new AtomicInteger(0);
		System.out.println(" AtomicIntegerTest --");
		for(int i= 0;i<=10;i++) {
			new Thread(new AtomicIntegerRunnable(atm)).start();
		}
	}
}
