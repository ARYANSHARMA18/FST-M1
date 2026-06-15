package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity10 {
	public static void main(String[] args) {
		Map<Integer,String> colours = new HashMap<Integer,String>();
		
		colours.put(1,"red");
		colours.put(2,"orange");
		colours.put(3,"green");
		colours.put(4, "white");
		colours.put(5, "black");
		
		colours.remove(5);
		
		System.out.println("After removing element: " + colours);
		
		if(colours.containsValue("green")){
	           System.out.println("green exists in the Map");
	        } else {
	            System.out.println("green does not exist in the Map");
	        }
		
		System.out.println("Number of pairs in the Map is: " + colours.size());
	}
}
