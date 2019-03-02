package com.practice.thread;

public class ManuaLock {

	public static void main(String[] args) {

		System.out.println("Manual Lock");
		PrinterQueue printerJob = new PrinterQueue();
		Thread[] threads = new Thread[15];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new ManualLockTester(printerJob),"Thread "+i);
		}
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
	}

}

class ManualLockTester implements Runnable {

	PrinterQueue printerJob = null;

	public ManualLockTester(PrinterQueue printerJobPassed) {
		this.printerJob = printerJobPassed;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		    System.out.println("Thread is started "+Thread.currentThread().getName());
			int i= 0;
			printerJob.printJob(" Document "+ i++);

	}

}
