package models;

public class Juice extends Beverage {


	private String fruit;
	
	public Juice(String name, double price, String fruit) {
		super(name, price);
		this.fruit = fruit;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println(" - "+ fruit);
	}
	
	

}
