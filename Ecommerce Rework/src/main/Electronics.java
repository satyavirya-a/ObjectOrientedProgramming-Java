package main;

public class Electronics extends Product {
	int warrantyMonths;
	public Electronics(String name, double price, int warrantyMonths) {
		super(name, price);
		this.warrantyMonths = warrantyMonths;
	}
	@Override
	public void printInfo() {
		
		System.out.println(name + " | Electronics | $" + price + " | Warranty: " + warrantyMonths + " months");
		
	}

}
