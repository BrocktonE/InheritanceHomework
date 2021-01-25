package com.revature.poly;

public class Truck extends Vehicle {
	
	public String name;
	
	public boolean fourwd;
	public int bedLength;
	
	public Truck(boolean fourWheelDrive, int bedLength) {
		
		fourwd = fourWheelDrive;
		bedLength = bedLength;		
		
	}
	 public void goOffroad() {
		 System.out.println("Can it go offroad?: " + fourwd);
		 
		 
	 }
	 
	 @Override
	 public void towCost(int milesTowed) {
		 System.out.println(weight*.0033*milesTowed);
		 
	 }
	

}

