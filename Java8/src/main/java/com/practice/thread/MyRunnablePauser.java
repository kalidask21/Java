package com.practice.thread;

public class MyRunnablePauser implements Runnable {

	ThreadPauser thp = null;
	
	public MyRunnablePauser(ThreadPauser thpassed) {
	   this.thp = thpassed;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				thp.look();
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("Its Running "+Thread.currentThread().getName());
			
		}	
	}

}
