package sample.com.sample;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	
	public static void main(String[] args) {
		
		System.out.println("Test");
		
		List<String> names = new ArrayList<>();
		names.add("Rajeshwari");
		names.add("Kalidas");
		names.add("Rajesh");
		names.add("XXX");
		
		names.forEach(V ->{
			if(V.equals("Rajeshwari")){
				System.out.println("Hi , Its me "+V);
			}else if(V.equals("Kalidas")) {
				System.out.println("Hi , Its my husband "+V);
			}else if(V.equals("Rajesh")) {
				System.out.println("Hi , Its my brother "+V);
			}else {
				System.out.println("Hi , Its some one "+V);
			}
		});
	
		
		
	}
}
