package main;

public class Fashion extends Product {
	
	public String size;
	
	public Fashion(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}

}
