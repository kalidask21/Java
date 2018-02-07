package com.bitcoin.services.crypto;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.bitcoin.services.rest.AlphaAvantageRestImpl;
import com.bitcoin.services.rest.IAlphaAvantageRest;
import com.bitcoin.services.rest.RequestQueryParam;

public class CrytoCoinServiceImpl implements CryptoCoinInterface {

	RequestQueryParam query = new RequestQueryParam();

	public CrytoCoinServiceImpl() {
		query.setFunction("DIGITAL_CURRENCY");
		query.setTimeFrequency("INTRADAY");
		query.setInterval("1min");
	}

	@Override
	public Map<String, Object> callBitCoin() {
		// TODO Auto-generated method stub
		query.setSymbol("BTC");
		return RestEndCaller();

	}

	@Override
	public Map<String, Object> callLiteCoin() {
		// TODO Auto-generated method stub
		query.setSymbol("LTC");
		return RestEndCaller();
	}

	@Override
	public Map<String, Object> callEtherium() {
		// TODO Auto-generated method stub
		query.setSymbol("ETH");
		return RestEndCaller();
	}

	@Override
	public Map<String, Object> callRipple() {
		// TODO Auto-generated method stub
		query.setSymbol("XRP");
		return RestEndCaller();
	}

	private Map<String,Object> RestEndCaller() {
		Map<String,Object> seriesMap = Collections.EMPTY_MAP;
		try {
			IAlphaAvantageRest alpsRest = new AlphaAvantageRestImpl();
			String responseString = alpsRest.getResponse(query);
			Object timeSeries = alpsRest.getTimeSeries(alpsRest.convertResponsStringToMap(responseString));
			seriesMap = (Map<String, Object>) timeSeries;
			seriesMap.forEach((k,v) -> {
				//System.out.println(" Time is "+ k + " Val is "+v.toString().split(",")[0]);
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return seriesMap;
	}

}
