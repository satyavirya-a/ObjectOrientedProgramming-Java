package models;

public class Sedan extends Car {

	public Sedan() {
		// TODO Auto-generated constructor stub
	}

	public Sedan(String brand, String name, String status, int year) {
		super(brand, name, status, year);
		// TODO Auto-generated constructor stub
	}
	
	public int calculatePrice(int day) {
		
		if (day == 1) {
			return 50;
		}
		
		else {
			return 30*(day-1) + 50;
		}
	}

	@Override
	public String stringInfo() {
		// TODO Auto-generated method stub
		return "Sedan: " + super.stringInfo();
	}
	
	

}
