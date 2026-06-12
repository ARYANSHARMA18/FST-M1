package activities;

public class Activity7 {
	public static void main(String[] args) {
		MountainBike bike = new MountainBike(3,5,10);
		System.out.println(bike.bicycleDesc());
		bike.speedUp(40);
		bike.applyBrake(45);
	}
}
