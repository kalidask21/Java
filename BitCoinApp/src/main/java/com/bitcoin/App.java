package com.bitcoin;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.bitcoin.services.crypto.CryptoCoinInterface;
import com.bitcoin.services.crypto.CrytoCoinServiceImpl;

/**
 * Hello world!
 *
 */
public class App {

	public void scheduleExecutor() {

		CryptoCoinInterface crypto = new CrytoCoinServiceImpl();
		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello App! Executior Started ");
				crypto.callRipple();
			}
		}, 0, 10, TimeUnit.MINUTES);
	}

	public static void main(String[] args) {
		App app = new App();
		app.scheduleExecutor();

	}
}
