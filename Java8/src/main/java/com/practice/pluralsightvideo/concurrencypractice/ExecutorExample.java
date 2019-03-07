package com.practice.pluralsightvideo.concurrencypractice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ExecutorExample {

	public static void main(String[] args) throws InterruptedException {

		// Will create and maintain the single thread and will be active still pool is
		// upp.
		// will get shutdown only calling shut down
		ExecutorService execService = Executors.newSingleThreadExecutor();
		
		ExecutorService execService1 = Executors.newFixedThreadPool(5);
		ExecutorService execService2 = Executors.newCachedThreadPool();
		ExecutorService execService3 = Executors.newWorkStealingPool();
		ScheduledExecutorService execService4 = Executors.newScheduledThreadPool(10);
		ExecutorService execService5 = Executors.newSingleThreadScheduledExecutor();
		
		
		
        System.out.println("Started - Runnable");
		Runnable r1 = () -> {
			while (true) {
				try {
					System.out.println("Runnable");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		execService1.execute(r1);
		
		System.out.println("Stop");
		//execService.shutdown();
	//	execService.shutdownNow();
		System.out.println("Started - Callable");
		
		Callable<String> call1 = () -> {
			return "Callable Task " +Thread.currentThread().getName();
		};
		
		for(int i =0;i<10;i++) {
		    Future<String> future = execService1.submit(call1);
		    try {
				System.out.println("Future :"+future.get());
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
