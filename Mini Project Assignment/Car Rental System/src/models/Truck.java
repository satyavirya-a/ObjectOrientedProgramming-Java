package models;

public class Truck extends Car {

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(String brand, String name, String status, int year) {
		super(brand, name, status, year);
		// TODO Auto-generated constructor stub
	}
	
	public int calculatePrice(int day) {
		
		if (day == 1) {
			return 120;
		}
		
		else {
			return 115*(day-1) + 120;
		}
	}
	
	@Override
	public String stringInfo() {
		// TODO Auto-generated method stub
		return "Truck: " + super.stringInfo();
	}

}
