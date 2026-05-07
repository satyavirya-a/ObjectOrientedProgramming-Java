package main;

public class Food extends Product {

	public String expiryDate;
	public Food(String name, double price, String expiryDate) {
		super(name, price);
		this.expiryDate = expiryDate;
	}
	
	@Override
	public void printInfo() {
		System.out.println(name + " | Food | $" + price + " | Expiry: " + expiryDate);
	}
	
	

}
