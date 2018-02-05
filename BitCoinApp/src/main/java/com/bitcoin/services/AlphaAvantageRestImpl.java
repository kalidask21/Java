package com.bitcoin.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AlphaAvantageRestImpl implements IAlphaAvantageRest {

	public Map<String, Object> getResponse(String function, String TimeFrequency, String symbol) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			RestTemplate restTemplate = new RestTemplate();
			ObjectMapper mapper = new ObjectMapper();
			
			// System.out.println("URL : " + url.toString());
			String queryParams = this.constructQueryParam(function, TimeFrequency, symbol);
			//System.out.println(BASE_URL.toString() + queryParams);
			String responseString = restTemplate.getForObject(BASE_URL.toString() + queryParams, String.class);
			map = mapper.readValue(responseString, new TypeReference<Map<String, Object>>(){});
			//System.out.println(map);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
		
	}

	public String constructQueryParam(String function, String TimeFrequency, String symbol) {
		StringBuffer params = new StringBuffer();
		if (!StringUtils.isEmpty(function)) {
			params.append("function=").append(function);
		}
		if (!StringUtils.isEmpty(TimeFrequency)) {
			params.append("_").append(TimeFrequency);
		}
		if (!StringUtils.isEmpty(symbol)) {
			params.append("&symbol=").append(symbol).append("&market=USD");
		}
		params.append("&apikey=").append(API_KEY);
		return params.toString();
	}

}
