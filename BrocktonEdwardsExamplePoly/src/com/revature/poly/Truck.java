package com.revature.poly;

public class Truck extends Vehicle {
	
	
	
	
	public boolean fourwd;
	public int bedLength;
	
	public Truck(boolean fourWheelDrive, int bedLength, int year, String make, String model, String color, int numDoors, int price, int weight) {
		super (year, make, model,color, numDoors, price, weight);
		
		
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
	public boolean isFourwd() {
		return fourwd;
	}
	public void setFourwd(boolean fourwd) {
		this.fourwd = fourwd;
	}
	public int getBedLength() {
		return bedLength;
	}
	public void setBedLength(int bedLength) {
		this.bedLength = bedLength;
	}
	

}

