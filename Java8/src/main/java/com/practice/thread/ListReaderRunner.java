package com.practice.thread;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ListReaderRunner implements Runnable{

	private List<String> nameList;
	private AtomicInteger atnI;
	
	public ListReaderRunner(List<String> name,AtomicInteger atmIpass) {
		nameList = name;
		atnI = atmIpass;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!nameList.isEmpty()) {
			//synchronized (nameList) {
			 
				if(!nameList.isEmpty() && atnI.get() < nameList.size()-1) {
					System.out.println("Atomic Val : "+atnI.get()+"Thread :  "+Thread.currentThread().getName() + " Name : "+nameList.get(atnI.addAndGet(1)));
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			//}
		}
	}

}
