package com.practice.thread.readfile.concurrently;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDownLatchTest {

	public static List<String> orders = Stream.of("PIZZA","BURGER","RICE","CHICKEN").collect(Collectors.toList());
	
	public static void main(String[] args) throws InterruptedException {

		int noOfOrders = 6;
		CountDownLatch countDL = new CountDownLatch(noOfOrders);
		List<String> content = new ArrayList<>();
		Thread th1 = new Thread(new Server(countDL, content));
		th1.start();
		for (int i = 1; i <= 2; i++) {
			int randomNum = (int)(Math.random() * 4);
			new Thread(new Kitchen(countDL, content), "Kichen " + i + " - Order is "+orders.get(randomNum)).start();
		};
		// Thread th3 = new Thread(new Kitchen(countDL));

		// th3.start();

		// Thread.sleep(4000);

	}
}

class Server implements Runnable {

	private CountDownLatch countdownLatcher;
	List<String> contentWriter;

	Server(CountDownLatch countDL, List<String> content) {
		this.countdownLatcher = countDL;
		this.contentWriter = content;
	}

	@Override
	public void run() {
		try {
			System.out.println("Chef is Working on Kitchen");
			countdownLatcher.await();
			Path path = Paths.get("C:\\apps", "ordersList.txt");
			if (Files.exists(path))
				try {
					contentWriter.addAll(Files.lines(path).collect(Collectors.toList()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			try {
				Files.write(path, contentWriter);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for (String s : contentWriter) {
				System.out.println("Orders List " + s);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contentWriter.clear();
		System.out.println("Order is getting Ready from Kitchen, Please serve");
	}

}

class Kitchen implements Runnable {

	private CountDownLatch countdownLatcher;
	List<String> contentWriter;

	Kitchen(CountDownLatch countDL, List<String> content) {
		this.countdownLatcher = countDL;
		this.contentWriter = content;
	}

	@Override
	public void run() {
		try {
			while (countdownLatcher.getCount() > 0) {
				Thread.sleep(2000);
				countdownLatcher.countDown();
				// System.out.println(countdownLatcher.getCount());
				contentWriter.add("Thread : " + Thread.currentThread().getName() +" : Order is ready");
				// System.out.println("Thread : "+Thread.currentThread().getName() +" Order is
				// ready");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}