package activities;

import java.util.*;

public class Activity12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		Random indexGen = new Random();
		
		System.out.println("Enter numbers and non-integer to terminate: ");
		
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		Integer num[] = list.toArray(new Integer[0]);
		
		int index = indexGen.nextInt(num.length);
		
		System.out.println("value at index " + index + " is: " + num[index]);
		
		scan.close();
	}
}
