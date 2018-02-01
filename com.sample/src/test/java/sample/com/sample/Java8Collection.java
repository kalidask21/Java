package sample.com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8Collection {

    Map<String,String> countryMap= new HashMap<String,String>();
    List<String> listList = new ArrayList<String>();
    ConvertStatesJson convertObj;
     
	{
		convertObj = new ConvertStatesJson("");
	}
	
	public Map<String,String> getStatesOfUSA(){
		Map<String,String> states = new HashMap<String, String>();
		states.putAll(convertObj.convertJsonToMap());
		return states;
	}
	
	
	public static void main(String[] args) {
	
		Java8Collection java8Obj = new Java8Collection();
		
		
		java8Obj.getStatesOfUSA().forEach((K,V) -> {
			System.out.println(" states codes are  "+K);
			
		});
		
		
		
	}
}
