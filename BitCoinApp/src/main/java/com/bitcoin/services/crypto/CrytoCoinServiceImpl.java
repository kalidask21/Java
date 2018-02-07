package com.bitcoin.services.crypto;

import java.util.Map;

import com.bitcoin.services.rest.AlphaAvantageRestImpl;
import com.bitcoin.services.rest.IAlphaAvantageRest;
import com.bitcoin.services.rest.RequestQueryParam;

public class CrytoCoinServiceImpl implements CryptoCoinInterface{

	
	RequestQueryParam query = new RequestQueryParam();
	public CrytoCoinServiceImpl(){
		query.setFunction("DIGITAL_CURRENCY");
		query.setTimeFrequency("INTRADAY");
		query.setInterval("1min");
	}
	
	@Override
	public void callBitCoin() {
		// TODO Auto-generated method stub
		query.setSymbol("BTC");
		try {
			IAlphaAvantageRest alpsRest = new AlphaAvantageRestImpl();
			String responseString = alpsRest.getResponse(query);
			Object timeSeries = alpsRest.getTimeSeries(alpsRest.convertResponsStringToMap(responseString));
			Map<String,Object> seriesMap = (Map<String, Object>) timeSeries;
			seriesMap.forEach((k,v) -> {
				System.out.println(" Time is "+ k + " Val is "+v.toString().split(",")[0]);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void callLiteCoin() {
		// TODO Auto-generated method stub
		query.setSymbol("LTC");
		try {
			IAlphaAvantageRest alpsRest = new AlphaAvantageRestImpl();
			String responseString = alpsRest.getResponse(query);
			Object timeSeries = alpsRest.getTimeSeries(alpsRest.convertResponsStringToMap(responseString));
			Map<String,Object> seriesMap = (Map<String, Object>) timeSeries;
			seriesMap.forEach((k,v) -> {
				System.out.println(" Time is "+ k + " Val is "+v.toString().split(",")[0]);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void callEtherium() {
		// TODO Auto-generated method stub
		query.setSymbol("ETH");
		try {
			IAlphaAvantageRest alpsRest = new AlphaAvantageRestImpl();
			String responseString = alpsRest.getResponse(query);
			Object timeSeries = alpsRest.getTimeSeries(alpsRest.convertResponsStringToMap(responseString));
			Map<String,Object> seriesMap = (Map<String, Object>) timeSeries;
			seriesMap.forEach((k,v) -> {
				System.out.println(" Time is "+ k + " Val is "+v.toString().split(",")[0]);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void callRipple() {
		// TODO Auto-generated method stub
		query.setSymbol("XRP");
		try {
			IAlphaAvantageRest alpsRest = new AlphaAvantageRestImpl();
			String responseString = alpsRest.getResponse(query);
			Object timeSeries = alpsRest.getTimeSeries(alpsRest.convertResponsStringToMap(responseString));
			Map<String,Object> seriesMap = (Map<String, Object>) timeSeries;
			seriesMap.forEach((k,v) -> {
				System.out.println(" Time is "+ k + " Val is "+v.toString().split(",")[0]);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
