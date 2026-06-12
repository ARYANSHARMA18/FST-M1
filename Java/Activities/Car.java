package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres = 4;
	int doors = 4;
	
	
	public Car(String color,String transmission, int make) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
	}
	
	public void displayCharacteristics() {
		System.out.println("This car has " + this.color + "color");
		System.out.println("This car has " + this.transmission + "transmission");
		System.out.println("This car has " + this.make + "make");
		System.out.println("This car has " + this.tyres + "tyres");
		System.out.println("This car has " + this.doors + "doors");
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}
}
