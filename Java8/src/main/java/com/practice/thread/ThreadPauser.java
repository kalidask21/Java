package com.practice.thread;

public class ThreadPauser {

	private boolean isPaused = false;
	
	public synchronized void pause() {
		System.out.println("Paused Th "+Thread.currentThread().getName());
		isPaused = true;	
	}
	
	public synchronized void resume() {
		System.out.println("Resume Th "+Thread.currentThread().getName());
		isPaused = false;
		System.out.println("Completed Some Operation All threads Run now");
		notifyAll();
	}
	
	public synchronized void look() {
		while(isPaused) {
			try {
				System.out.println("Doing Some Operation All threads Wait");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		ThreadPauser thp = new ThreadPauser();
		for(int i = 0;i<=10; i++) {
			new Thread(new MyRunnablePauser(thp), "Thread - "+i).start();
		}
		
		
	}
}
