package materiDanContohVehicle;

import javax.print.attribute.standard.PrinterInfo;

public class Car extends Vehicle {
	
	public int seat;
	
	

	public Car() {
		super(4, "Mobil");
		// TODO Auto-generated constructor stub
	}



	public Car(int roda, String name, int seat) {
		super(roda, name); //super ini refer ke constructor parentnya
		this.seat = seat;
	}
	
	
	public void printInfo() {
		System.out.println(name + " - " + roda + " - " + seat);
	}
	
	
	
	

	
}
