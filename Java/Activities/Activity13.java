package activities;

import java.util.*;

public class Activity13 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the user age in words : ");
		 String age = scan.nextLine();

	     scan.close();
		 
		registerUser(age);
	}
	
	
	public static void registerUser(String age) {
		
		try{
			int userAge = Integer.parseInt(age);

			if(userAge < 18 ) {
				throw new IllegalArgumentException("Users must be at least 18 years old"); 
			}
			
			System.out.println("Registration successful! Welcome aboard.");
			
		}catch(NumberFormatException ex) {
				System.out.println("Error: Age must be a valid number.");
		}catch(IllegalArgumentException ex) {
			System.out.println("Registeration Failed : " + ex.getMessage());
			}
		}
	}
