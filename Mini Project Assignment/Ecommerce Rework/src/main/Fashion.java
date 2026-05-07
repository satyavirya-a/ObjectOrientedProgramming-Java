package main;

public class Fashion extends Product {
	
	public String size;
	
	public Fashion(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public void printInfo() {
		
		System.out.println(name + " | Fashion | $" + price + " | Size: " + size);
		
	}

}
