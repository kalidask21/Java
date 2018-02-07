package com.bitcoin.services.crypto.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class CryptoUtils {
	
	public static List<Object> CovertRatesMapToListByDate(Map<String,Object> rates,String byDate){
		List<Object> ratesList = filterRatesByDate(rates,byDate).values().stream().collect(Collectors.toList());
		return ratesList;
	}
	
	public static Map<String,Object> filterRatesByDate(Map<String,Object> rateMap, String byDate){
		Map<String,Object> rates = rateMap;
		if(null != byDate) {
			rates = rates.entrySet().stream().filter(map -> map.getKey().contains(byDate)).collect(
					Collectors.toMap(p ->p.getKey(), p -> p.getValue()));
		}
		return rates;
	}
	
	public static List<Object> findMaxRateByDate(Map<String,Object> rates,String byDate){
		List<Object> ratesList = filterRatesByDate(rates,byDate).values().stream().collect(Collectors.toList());
		return ratesList;
	}
	
	public static List<Object> splitRateFromResponse(List<Object> rates){
		List<Object> ratesList = rates.stream().map(val -> val.toString().split(",")[0].split("=")[1]).collect(Collectors.toList());
		return ratesList;
	}

	public static void ReadableResponse(Map<String,Object> rateMap, String byDate){
		Map<String,Object> rates = filterRatesByDate(rateMap, byDate);
		rates.forEach((date,Value)->{
			System.out.println("#Date is :"+date + ",  #Rate1 is :"+Value.toString().split(",")[0].split("=")[1]);
		});
	}
	
	public String splitRate1(String rate) {
		return rate.toString().split(",")[0].split("=")[1];
	}
	
	public static Float maxRate(List<Object> rates){
		List<Float> ratesLong = rates.stream().map(obj -> Float.valueOf(obj.toString())).collect(Collectors.toList());
		return ratesLong.stream().max(Float::compare).get();
	}
	
	public static Float minRate(List<Object> rates){
		List<Float> ratesLong = rates.stream().map(obj -> Float.valueOf(obj.toString())).collect(Collectors.toList());
		return ratesLong.stream().min(Float::compare).get();
	}
}
