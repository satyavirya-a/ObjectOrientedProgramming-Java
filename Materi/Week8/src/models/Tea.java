package models;

public class Tea extends Beverage {
	
	private String teaType;

	public Tea(String name, double price, String teaType) {
		super(name, price);
		this.teaType = teaType;
	}

	
	public void printInfo() {
		super.printInfo();
		System.out.println(" - " + teaType);
	}
}
