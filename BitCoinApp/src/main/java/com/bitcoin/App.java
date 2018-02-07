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
				try {
					List<Object> RatesRespone = CryptoUtils.CovertRatesMapToListByDate(crypto.callLiteCoin(),null);
					RatesRespone = CryptoUtils.splitRateFromResponse(RatesRespone);
					System.out.println(" RatesRespone "+RatesRespone);
					System.out.println(" Max Rate is "+CryptoUtils.maxRate(RatesRespone));
					System.out.println(" Max Rate is "+CryptoUtils.minRate(RatesRespone));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}, 0, 10, TimeUnit.MINUTES);
	}

	public static void main(String[] args) {
		App app = new App();
		app.scheduleExecutor();

	}
}
