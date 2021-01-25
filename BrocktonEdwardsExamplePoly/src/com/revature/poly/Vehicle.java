package com.revature.poly;

public class Vehicle {


			
			int Year;
			String make;
			String model;
			String color;
			int numDoors;
			int price;
			int weight;
			
			public Vehicle (int Yearmade, String mani, String name, String colorof, int Doors, int cost, int mass) {
				Year = Yearmade;
				make = mani;
				model = name;
				color = colorof;
				numDoors = Doors;
				price = cost;
				weight = mass;
				
			}
			
			public void whatkind() {
				System.out.println("I have a " + color + Year + make + model );
			}
			
			public void howmuch() {
				System.out.println("My vehicle cost "+price);
				
			}
			
			public void age() {
				System.out.println(2021-Year);
				
			}
			
			public void towCost(int milesTowed) {
				System.out.println(weight*.0022*milesTowed);
				
			}
			
			
			
			
			

			public static void main(String[] args) {
				
				Vehicle niceRide = new Vehicle(2009, "Toyota", "Camry", "White", 4, 6500, 3800);
				Vehicle corvette= new Vehicle (2021, "Chevrolet", "Corvette", "Blue", 2, 88000, 2900);
				Truck myBlazer = new Truck (1989, "Chevrlet", "Blazer", "Red", 2, 12500, 5500);
				
				
				niceRide.whatkind();
				niceRide.towCost(100);


			}

		}


	}

}
