package com.practice.thread;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import com.practice.thread.readfile.concurrently.FileReader;

public class ListMultiThreadReaderTest {

	public static void main(String[] args) {
		
		List<String> lines = null;
		try {
			lines = FileReader.Reader.readFileByNIO("C:\\apps\\", "DG.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		AtomicInteger atm = new AtomicInteger(-1);
	//	Semaphore sm  = new Semaphore(1);
		
		//for(int i =0;i<5;i++) {
			//new Thread(new ListReaderRunner(names,atm)," Thread - "+i).start();
		//}
		
		// Trying in Executor Service
		
		ExecutorService executor = Executors.newScheduledThreadPool(5);
		for(int i =0;i<5;i++) {
			executor.execute(new ListReaderRunner(lines,atm));
		}
		
		if(executor.isTerminated()) {
			
		}
		
		executor.shutdown();
		
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		for(Thread th: threadSet) {
			System.out.println("Still on :"+th.getName());
		}
		
	}
	
}
