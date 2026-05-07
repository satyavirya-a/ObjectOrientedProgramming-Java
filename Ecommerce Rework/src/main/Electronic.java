package main;

public class Electronic extends Product {
	int warrantyMonths;
	public Electronic(String name, double price, int warrantyMonths) {
		super(name, price);
		this.warrantyMonths = warrantyMonths;
	}

}
