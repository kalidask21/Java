package com.bitcoin.services.rest;

import java.util.Map;

public interface IAlphaAvantageRest {
    
	//https://www.alphavantage.co/query?function=DIGITAL_CURRENCY_INTRADAY&symbol=LTC&market=USD&apikey=G9C6RBMXKKCRK5R0
	
	public String API_KEY = "G9C6RBMXKKCRK5R0";	
	public String BASE_URL = "https://www.alphavantage.co/query?datatype=json&";
	
	public String getResponse(RequestQueryParam query);
	
	public String constructQueryParam(RequestQueryParam query);
	
	public Map<String,Object> convertResponsStringToMap(String reponse);

	Object getTimeSeries(Map<String, Object> responseMap);
}
