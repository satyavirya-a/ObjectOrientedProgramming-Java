package models;

import main.Waterable;

public class Flower extends Plant implements Waterable {
	
	protected String color;

	public Flower() {
		// TODO Auto-generated constructor stub
	}
	
	public Flower(String name, String color) {
		super(name);
		this.color = color;
		
	}

	@Override
	public void fertilizing() {
		// TODO Auto-generated method stub
		System.out.println("Fertilizing " + name + " Flower");
	}
	

	@Override
	public void watering() {
		// TODO Auto-generated method stub
		System.out.println("Watering " + name + " Flower");
	}


}
