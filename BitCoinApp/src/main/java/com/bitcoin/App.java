package com.bitcoin;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.bitcoin.services.crypto.CryptoCoinInterface;
import com.bitcoin.services.crypto.CryptoCoinServiceImpl;
import com.bitcoin.services.crypto.util.CryptoUtils;

/**
 * Hello world!
 *
 */
public class App {

	public void scheduleExecutor() {

		CryptoCoinInterface crypto = new CryptoCoinServiceImpl();
		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello App! Executior Started ");
				CryptoUtils.ReadableResponse(crypto.callRipple(),"2018-02-06");
				
			}
		}, 0, 10, TimeUnit.MINUTES);
	}

	public static void main(String[] args) {
		App app = new App();
		app.scheduleExecutor();

	}
}
