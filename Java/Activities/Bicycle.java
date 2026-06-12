package activities;

public class Bicycle implements BicycleParts, BicycleOperations{
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	@Override
	public void applyBrake(int decrement) {
		if(currentSpeed >= decrement) {
			currentSpeed-=decrement;			
		} else {
			currentSpeed = 0;
			System.out.println("Speed can't be decreased futher!");
		}
		
		System.out.println("Speeding down: Current Speed is :" + currentSpeed );
	}

	@Override
	public void speedUp(int increment) {
		if((increment + currentSpeed) <= maxSpeed  ) {
			currentSpeed+=increment;
		}else {
			currentSpeed = maxSpeed;
			
			System.out.println("Speed can't be increased further!");
		}
		
		System.out.println("Speeding up: Current Speed is :" + currentSpeed );
	}
	
	public String bicycleDesc() {
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	}

}
