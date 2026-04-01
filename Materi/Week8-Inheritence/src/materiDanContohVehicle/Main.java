package materiDanContohVehicle;

import java.util.ArrayList;

//Abstract class itu gak bisa dibuat object, jadi harus dari anaknya
//	Abstract method itu yang langsung titik koma, gak perlu dibuat isi kodingan dalamenya

//FINAL Class itu class yang udah gak bisa buat subclass nya

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car(4, "Ferrari", 4);
		
		c.gas(); //c itu anak dari vehicle, bisa pake method dari vehicle
		System.out.println();
		
		//instance
		Vehicle v = new Car(4, "Lambo", 2);
		
		//dia vehicle tapi instance nya car
			// kalau mau ngecek kalau instance nya adalah Car, trus type cast
			if (v instanceof Car) {
				((Car)v).seat = 3; //typecast jadi car, ganti
			}
		
		//bikin array list parent isinya child
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(c);
		vehicles.add(new Motorcycle(2, "beat"));
		
		for (Vehicle vehicle : vehicles) {
			vehicle.gas();
		}
	
	}

}
