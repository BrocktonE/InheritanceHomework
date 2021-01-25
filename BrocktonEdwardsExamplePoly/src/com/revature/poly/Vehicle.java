package com.revature.poly;

public class Vehicle {
	public Vehicle() {

	}

	int year;
	String make;
	String model;
	String color;
	int numDoors;
	int price;
	int weight;

	public Vehicle(int year, String make, String model, String color, int numDoors, int price, int weight) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.numDoors = numDoors;
		this.price = price;
		this.weight = weight;

	}

	public void whatkind() {
		System.out.println("I have a " + color + year + make + model);
	}

	public void howmuch() {
		System.out.println("My vehicle cost " + price);

	}

	public void age() {
		System.out.println(2021 - year);

	}

	public void towCost(int milesTowed) {
		System.out.println(weight * .0022 * milesTowed);

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
