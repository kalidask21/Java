package com.bitcoin;

import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.bitcoin.services.AlphaAvantageRestImpl;
import com.bitcoin.services.IAlphaAvantageRest;
import com.bitcoin.services.RequestQueryParam;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void scheduleExecutor() {
		
		RequestQueryParam query = new RequestQueryParam();
		query.setFunction("DIGITAL_CURRENCY");
		query.setTimeFrequency("INTRADAY");
		query.setSymbol("LTC");
		query.setInterval("1min");
		
		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.scheduleAtFixedRate(new Runnable() {
		  @Override
		  public void run() {
			    System.out.println( "Hello App! Executior Started " );
		        IAlphaAvantageRest alpsRest = new AlphaAvantageRestImpl();
		        
		        Map<String ,Object> responseMap = alpsRest.getResponse(query);
		        Map<String,Object> rates = (Map<String, Object>) responseMap.get("Time Series (Digital Currency Intraday)");
		        
	        	rates.forEach((k,v) ->{
	        		System.out.println("Time is "+k+ " Val : "+v);
	        	});
	        	
	        	
		        	
		  }
		}, 0, 1, TimeUnit.MINUTES);
	}
	
    public static void main( String[] args )
    {
    	App app = new App();
    	app.scheduleExecutor();
       
     
    }
}
