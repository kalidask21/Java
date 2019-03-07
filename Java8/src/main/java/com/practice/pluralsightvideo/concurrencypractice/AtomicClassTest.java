package com.practice.pluralsightvideo.concurrencypractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassTest {

	public static void main(String[] args) {

		final AtomicInteger atmVar = new AtomicInteger(0);
		final int integer = 0 ;
        ExecutorService exec = Executors.newFixedThreadPool(5);
        
		for(int i=0;i<50;i++)
			exec.execute(new AtomicClassTest().new Incrementor(atmVar,integer));
		
	}

	class Incrementor implements Runnable {

		private AtomicInteger atmVarObj;
		private Integer integerVal;

		public Incrementor(AtomicInteger atmVar,int integer) {
			this.atmVarObj = atmVar;
			this.integerVal = integer;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (integerVal) {
				atmVarObj.incrementAndGet();
				integerVal = integerVal + 1;
				System.out.println("Thread "+Thread.currentThread().getName() +" Atomic is" +atmVarObj.get() + " Int is "+integerVal);
			}
		}

	}

}
