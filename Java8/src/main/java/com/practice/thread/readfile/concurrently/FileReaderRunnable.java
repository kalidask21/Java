package com.practice.thread.readfile.concurrently;

import java.util.List;
import java.util.concurrent.Semaphore;

public class FileReaderRunnable {
	
	public static void main(String[] args) {
		
		Semaphore sm = new Semaphore(1);
		try {
			List<String> lines = null;//FileReader.ReaderInstance.readFileByNIO("C:\\apps\\", "DG.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0;i < 5 ;i++) {
			//new Thread(new FileReaderRunner(sm)).start();;
		}
		
	}
	
}

class FileReaderRunner implements Runnable{

	private Semaphore semaphone;
	private List<String> lines;
	
	public FileReaderRunner(Semaphore sem,List<String> lines) {
		this.semaphone = sem;
		this.lines = lines;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			semaphone.acquire();
			try {
				System.out.println("Thread "+Thread.currentThread().getName());
				//lines.get()
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		semaphone.release();
	}

}
