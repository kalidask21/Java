package com.bitcoin.services;

import java.util.Map;

public interface IAlphaAvantageRest {
    
	//https://www.alphavantage.co/query?function=DIGITAL_CURRENCY_INTRADAY&symbol=LTC&market=USD&apikey=G9C6RBMXKKCRK5R0
	
	public String API_KEY = "G9C6RBMXKKCRK5R0";	
	public String BASE_URL = "https://www.alphavantage.co/query?";
	
	public Map<String, Object> getResponse(RequestQueryParam query);
	
	public String constructQueryParam(RequestQueryParam query);
}
