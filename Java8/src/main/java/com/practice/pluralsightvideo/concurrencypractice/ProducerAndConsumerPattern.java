package com.practice.pluralsightvideo.concurrencypractice;

import java.util.ArrayList;
import java.util.List;

import com.practice.thread.PCLockInterface;

public class ProducerAndConsumerPattern {

	public static void main(String[] args) {

		List<String> message = new ArrayList<>();

		// * Intrinsic Lock Mechanism
		// using Wait and notify pattern method.
		//
		PCSynchronized pcSync = new PCSynchronized();
		// Using Lock Interface

		Runnable pro = () -> {
			try {
				pcSync.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable con = () -> {
			try {
				pcSync.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		PCLockInterface pclock = new PCLockInterface();
		
		Runnable proLock = () -> {
			try {
				pclock.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable conLock = () -> {
			try {
				pclock.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		

		//new Thread(pro).start();
		//new Thread(con).start();
		
		new Thread(proLock).start();
		new Thread(conLock).start();
	}

}
