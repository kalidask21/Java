package com.bitcoin.services.rest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AlphaAvantageRestImpl implements IAlphaAvantageRest {

	public String getResponse(RequestQueryParam queryParam) {
		   // TODO Auto-generated method stub
			RestTemplate restTemplate = new RestTemplate();
			String queryParams = this.constructQueryParam(queryParam);
			ResponseEntity<String> responseEntity = restTemplate.getForEntity((BASE_URL.toString() + queryParams), String.class);
			String objects = responseEntity.getBody();
			MediaType contentType = responseEntity.getHeaders().getContentType();
			HttpStatus statusCode = responseEntity.getStatusCode();
		    return objects;
		
	}

	public String constructQueryParam(RequestQueryParam queryParam) {
		StringBuffer params = new StringBuffer();
		if (!StringUtils.isEmpty(queryParam.getFunction())) {
			params.append("function=").append(queryParam.getFunction());
		}
		if (!StringUtils.isEmpty(queryParam.getTimeFrequency())) {
			params.append("_").append(queryParam.getTimeFrequency());
		}
		if (!StringUtils.isEmpty(queryParam.getInterval())) {
			params.append("&interval=").append(queryParam.getInterval());
		}
		if (!StringUtils.isEmpty(queryParam.getSymbol())) {
			params.append("&symbol=").append(queryParam.getSymbol()).append("&market=USD");
		}
		params.append("&apikey=").append(API_KEY);
		return params.toString();
	}

	@Override
	public Map<String, Object> convertResponsStringToMap(String reponse) {

		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			ObjectMapper mapper = new ObjectMapper();
			map = mapper.readValue(reponse, new TypeReference<HashMap<String,Object>>(){});
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

	
	@Override
	public Object getTimeSeries(Map<String, Object> responseMap) {
		return responseMap.get("Time Series (Digital Currency Intraday)");
	}
}
