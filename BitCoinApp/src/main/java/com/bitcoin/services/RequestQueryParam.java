package com.bitcoin.services;

public class RequestQueryParam {

	private String function;
	private String symbol;
	private String TimeFrequency;
	private String apikey;
	private String market;
	private String interval;
		
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getTimeFrequency() {
		return TimeFrequency;
	}
	public void setTimeFrequency(String timeFrequency) {
		TimeFrequency = timeFrequency;
	}
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	@Override
	public String toString() {
		return "RequestQueryParam [function=" + function + ", symbol=" + symbol + ", TimeFrequency=" + TimeFrequency
				+ ", apikey=" + apikey + ", market=" + market + ", interval=" + interval + "]";
	}
	
	
	
	
}
