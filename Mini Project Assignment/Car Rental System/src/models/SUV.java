package models;

public class SUV extends Car {

	public SUV() {
		// TODO Auto-generated constructor stub
	}

	public SUV(String brand, String name, String status, int year) {
		super(brand, name, status, year);
		// TODO Auto-generated constructor stub
	}
	
	public int calculatePrice(int day) {
		
		if (day == 1) {
			return 80;
		}
		
		else {
			return 75*(day-1) + 80;
		}
	}
	
	@Override
	public String stringInfo() {
		// TODO Auto-generated method stub
		return "SUV: " + super.stringInfo();
	}

}
