package activities;

import java.util.*;

public class Activity9 {
	public static void main(String[] args) {
	Set<String> hs = new HashSet<>();
	
	hs.add("ibm");
	hs.add("fst");
	hs.add("training");
	hs.add("java");
	hs.add("alchemy");
	hs.add("Aryan");
	
	System.out.println("Size of HashSet is: " + hs.size());
	
	if(hs.remove("training")) {
		System.out.println("training is removed from HashSet");
	}
	
	if(hs.remove("Sharma")) {
		System.out.println("Sharma is present in HashSet");
	}else {
		System.out.println("Sharma is not present!");
	}
	
	System.out.println("Is ibm present : " + hs.contains("ibm"));
	
	System.out.println("Updated HashSet: " + hs);
	
	}
}
