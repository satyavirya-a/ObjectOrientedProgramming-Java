package models;

public class Car {
	
	private String brand, name, status;
	private int year;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Car(String brand, String name, String status, int year) {
		super();
		this.brand = brand;
		this.name = name;
		this.status = status;
		this.year = year;
	}



	public int calculatePrice(int day) {
		return 0;
	}
	
	public String stringInfo() {
		return name + " " + brand + " (" + year + ")";
	}



	public String getName() {
		return name;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	

	

}
