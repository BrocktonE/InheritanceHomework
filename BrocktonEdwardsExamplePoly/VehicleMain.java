package com.revature.poly;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle niceRide = new Vehicle(2009, "Toyota", "Camry", "White", 4, 6500, 3800);
		Vehicle corvette= new Vehicle (2021, "Chevrolet", "Corvette", "Blue", 2, 88000, 2900);
		Vehicle blazer1= new Truck(true, 0, 1989 , "Chevrolet", "Blazer", "Red", 2, 12500, 5500);
		Vehicle blazer= new Vehicle(1989, null, null, null, 0, 0, 0);

		Truck t = (Truck) blazer1;
		t.goOffroad();
				
		
		
		niceRide.whatkind();
		niceRide.towCost(100);
		blazer1.towCost(100);
		System.out.println(t.isFourwd());
		
		
		


	}

		

	}


