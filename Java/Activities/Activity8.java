package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity8 {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		myList.add("ibm");
		myList.add("alchemy");
		myList.add("java");
		myList.add("fst");
		myList.add("training");
		
		for(String list : myList) {
			System.out.println(list);
		}
		
		System.out.println("3rd element: " + myList.get(2));
		
		System.out.println("Is Java present: " + myList.contains("fst"));
		
		System.out.println("Size of myList: " + myList.size());
		
		myList.remove("fst");
		
		System.out.println("Updated Size of myList: " + myList.size());
	}
}
