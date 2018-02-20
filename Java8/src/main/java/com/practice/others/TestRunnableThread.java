package com.practice.others;

public class TestRunnableThread {

	public static void main(String[] args) {
		RunnableThread runTh = new RunnableThread();
		Thread th = new Thread(runTh);
		th.start();
		System.out.println(Thread.currentThread().getName());
	}
}
