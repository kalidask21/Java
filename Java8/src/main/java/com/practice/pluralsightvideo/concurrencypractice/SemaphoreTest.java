package com.practice.pluralsightvideo.concurrencypractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String[] args) {

	 Semaphore smp = new Semaphore(3);
	 ExecutorService execSer = Executors.newFixedThreadPool(5);
	 
	 for(int i=0;i<3;i++) {
		 execSer.execute(new SemaphoreTest().new semphoreTestRunner(smp));
	 }
	 
	 execSer.shutdown();
	 
	}
	
	class semphoreTestRunner implements Runnable{

		Semaphore sema = null;
		semphoreTestRunner(Semaphore smp){
			this.sema = smp;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				try {
					System.out.println("before acquire , available res :"+sema.availablePermits());
					sema.acquire();
					System.out.println("after acquire , available res :"+sema.availablePermits());
					System.out.println("Acquried By : "+Thread.currentThread().getName());
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			finally {
				sema.release();
			}
		}
		
	}
}
