package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public Plane(int maxPassengers) {
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();
    }
    
    public void onBoard(String passenger) {
    	if(passengers.size() <= maxPassengers) {
    	   this.passengers.add(passenger);    	
    	} else {
    		System.out.println("Max Passengers Limit Hit!");
    	}
    }
    
    public Date takeOff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    }
    
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
    }
    
    public List<String> getPassengers(){
    	return passengers;
    }
}
