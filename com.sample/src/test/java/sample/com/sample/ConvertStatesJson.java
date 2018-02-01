package sample.com.sample;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class ConvertStatesJson {

	private String jsonObj = "";
	
	Gson gsonObj = null;
	
	public ConvertStatesJson(String json) {
		// TODO Auto-generated constructor stub
		gsonObj = new Gson();
		jsonObj = "{\n" + 
				"    \"AL\": \"Alabama\",\n" + 
				"    \"AK\": \"Alaska\",\n" + 
				"    \"AS\": \"American Samoa\",\n" + 
				"    \"AZ\": \"Arizona\",\n" + 
				"    \"AR\": \"Arkansas\",\n" + 
				"    \"CA\": \"California\",\n" + 
				"    \"CO\": \"Colorado\",\n" + 
				"    \"CT\": \"Connecticut\",\n" + 
				"    \"DE\": \"Delaware\",\n" + 
				"    \"DC\": \"District Of Columbia\",\n" + 
				"    \"FM\": \"Federated States Of Micronesia\",\n" + 
				"    \"FL\": \"Florida\",\n" + 
				"    \"GA\": \"Georgia\",\n" + 
				"    \"GU\": \"Guam\",\n" + 
				"    \"HI\": \"Hawaii\",\n" + 
				"    \"ID\": \"Idaho\",\n" + 
				"    \"IL\": \"Illinois\",\n" + 
				"    \"IN\": \"Indiana\",\n" + 
				"    \"IA\": \"Iowa\",\n" + 
				"    \"KS\": \"Kansas\",\n" + 
				"    \"KY\": \"Kentucky\",\n" + 
				"    \"LA\": \"Louisiana\",\n" + 
				"    \"ME\": \"Maine\",\n" + 
				"    \"MH\": \"Marshall Islands\",\n" + 
				"    \"MD\": \"Maryland\",\n" + 
				"    \"MA\": \"Massachusetts\",\n" + 
				"    \"MI\": \"Michigan\",\n" + 
				"    \"MN\": \"Minnesota\",\n" + 
				"    \"MS\": \"Mississippi\",\n" + 
				"    \"MO\": \"Missouri\",\n" + 
				"    \"MT\": \"Montana\",\n" + 
				"    \"NE\": \"Nebraska\",\n" + 
				"    \"NV\": \"Nevada\",\n" + 
				"    \"NH\": \"New Hampshire\",\n" + 
				"    \"NJ\": \"New Jersey\",\n" + 
				"    \"NM\": \"New Mexico\",\n" + 
				"    \"NY\": \"New York\",\n" + 
				"    \"NC\": \"North Carolina\",\n" + 
				"    \"ND\": \"North Dakota\",\n" + 
				"    \"MP\": \"Northern Mariana Islands\",\n" + 
				"    \"OH\": \"Ohio\",\n" + 
				"    \"OK\": \"Oklahoma\",\n" + 
				"    \"OR\": \"Oregon\",\n" + 
				"    \"PW\": \"Palau\",\n" + 
				"    \"PA\": \"Pennsylvania\",\n" + 
				"    \"PR\": \"Puerto Rico\",\n" + 
				"    \"RI\": \"Rhode Island\",\n" + 
				"    \"SC\": \"South Carolina\",\n" + 
				"    \"SD\": \"South Dakota\",\n" + 
				"    \"TN\": \"Tennessee\",\n" + 
				"    \"TX\": \"Texas\",\n" + 
				"    \"UT\": \"Utah\",\n" + 
				"    \"VT\": \"Vermont\",\n" + 
				"    \"VI\": \"Virgin Islands\",\n" + 
				"    \"VA\": \"Virginia\",\n" + 
				"    \"WA\": \"Washington\",\n" + 
				"    \"WV\": \"West Virginia\",\n" + 
				"    \"WI\": \"Wisconsin\",\n" + 
				"    \"WY\": \"Wyoming\"\n" + 
				"}";
	}
	
	public List<String> convertJsonToList(){
		List<String> listObject = Collections.emptyList();
		
		
		
		return listObject;
	}
	
	public Map<String,String> convertJsonToMap(){
		Map<String,String> mapObject = Collections.emptyMap();
		mapObject = (Map<String,String>)gsonObj.fromJson(jsonObj, Map.class);	
		return mapObject;
	}
}
