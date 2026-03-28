package main;

import Company.Car;

public class Customer {
	
	private String name;
	private Car rentedCar;

	public Customer(String name) {
		this.name = name;
	}
	
	public void rent(Car car) {
		rentedCar = car;
	}

}
