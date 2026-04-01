package main;

import java.util.*;


import models.*;

//sebenarnya bisa juga pakai 1 arraylist dengan status, nanti kalau mau rent car, tinggal buat array list tempAvail yang isinya car yang status available semua
//karena object yang ada di arraylist utama dan temp itu sama object referencenya, jadi bisa ke konek tanpa harus remove lagi kembali ke arraylist utama

/*
 * Car -> calPrice(int day), name, brand, year
 * SUV
 * Sedan
 * Truck
 * 
 * Insert: 
 * Type ? 
 * Name ?
 * Brand?
 * Year?
 * Data Inserted!
 * 
 * Rent
 * -> No available car!
 * - Show All avail car
 * Index ? 
 * Day ? 
 * Price: 80 + 75 bla blaba
 * 
 * 
 * Return
 * -> No available car kalau misal kaga ada yang di rent
 * - show all rented car
 * 
 * Remove
 * show semua car
 */
public class Main {
	
	public void insertCar(Scanner sc, ArrayList<Car> cars) {
		String type, name, brand;
		int year;
		System.out.println("Insert Car\n");
		System.out.print("Input Car Type [Sedan, SUV, Truck]: ");
		type = sc.next();
		sc.nextLine();
		
		System.out.print("Input Car Name: ");
		name = sc.nextLine();
		
		System.out.print("Input Car Brand: ");
		brand = sc.nextLine();
		
		System.out.println("Input Car Year: ");
		year = sc.nextInt();
		sc.nextLine();
		
		if (type.equals("Sedan")) {
			cars.add(new Sedan(brand, name, "available", year ) );
		}
		
		else if (type.equals("SUV")) {
			cars.add(new SUV(brand, name, "available", year ) );
		}
		
		else if (type.equals("Truck")) {
			cars.add(new Truck(brand, name, "available", year ) );
		}
		
		
	}
	
	public void rentCar(Scanner sc, ArrayList<Car>avail , ArrayList<Car>noAvail ) {
		System.out.println("Rent Car\n");
		
		if (avail.isEmpty()) {
			System.out.println("Tidak ada mobil yang bisa dipinjam!");
			sc.nextLine();
			return;
		}
		
		int i = 1;
		for (Car car : avail) {
			System.out.println(i++ + " " + car.stringInfo());
			
		}
		
		int idx;
		System.out.print("Nomor mobil yang mau dipinjam: ");
		idx = sc.nextInt();
		sc.nextLine();
		
		int day;
		System.out.println("Jumlah hari peminjaman: ");
		day = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Harga total: " + avail.get(idx - 1).calculatePrice(day));
		
		
		avail.get(idx - 1).setStatus("rented");
		
		noAvail.add(avail.get(idx - 1));
		avail.remove(idx -1);
		
		sc.nextLine();
	}
	
	public void returnCar(Scanner sc, ArrayList<Car>avail , ArrayList<Car>noAvail ) {
		System.out.println("Return Car\n");
		
		if (noAvail.isEmpty()) {
			System.out.println("Tidak ada mobil yang bisa dikembalikan!");
			sc.nextLine();
			return;
		}
		
		int i = 1;
		for (Car car : noAvail) {
			System.out.println(i++ + " " + car.stringInfo());
		}
		
		int idx;
		System.out.print("Nomor mobil yang mau kembalikan: ");
		idx = sc.nextInt();
		sc.nextLine();
		
		noAvail.get(idx-1).setStatus("available");
		
		avail.add(noAvail.get(idx - 1));
		noAvail.remove(idx -1);
		
	}
	
	public void removeCar(Scanner sc, ArrayList<Car>avail , ArrayList<Car>noAvail) {
		System.out.println("Remove Car");
		
		if (avail.isEmpty() && noAvail.isEmpty()) {
			System.out.println("Tidak ada mobil yang bisa dihapus");
			sc.nextLine();
			return;
		}
		int i = 1;
//		System.out.println("Avail");
		for (Car car : avail) {
			System.out.println(i++ + " " + car.stringInfo());
		}
//		System.out.println("No avail");
		for (Car car : noAvail) {
			System.out.println(i++ + " " + car.stringInfo());
		}
		
		int idx;
		System.out.print("Pilih nomor mobil yang mau di remove: ");
		idx = sc.nextInt();
		sc.nextLine();
		String temp;
		if (idx - 1 <= avail.size() - 1) {
			temp = avail.get(idx - 1).getName();
			avail.remove(idx - 1);
		}
		else {
			temp = noAvail.get(idx - 1 - avail.size()).getName();
			noAvail.remove(idx - 1 - avail.size());
		}
		
		System.out.println("Berhasil menghapus " + temp);
		
	}
	
	

	public Main() {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Car> AvailCars = new ArrayList<>();
		ArrayList<Car> NoAvailCars = new ArrayList<>();
		
		//DUMMY DATA
//		AvailCars.add(new Sedan("Toyota", "Brio Satya", "available", 2007 ) );
//		AvailCars.add(new SUV("Toyota", "Fortuner", "available", 2014 ) );
//		AvailCars.add(new Truck("Toyota", "Miso Sirup", "available", 2000 ) );
		
		
		int opt;
		
		do {
			
			System.out.println("CAR RENTAL SYSTEM");
			System.out.println("1. Insert Car");
			System.out.println("2. Rent Car");
			System.out.println("3. Return Car");
			System.out.println("4. Remove Car");
			System.out.println("5. Exit");
			System.out.print(">> ");
			opt = sc.nextInt();
			sc.nextLine();
			switch(	opt ) {
			case 1: insertCar(sc, AvailCars);
				break;
			case 2: rentCar(sc, AvailCars, NoAvailCars);
				break;
			case 3: returnCar(sc, AvailCars, NoAvailCars);
				break;
			case 4: removeCar(sc, AvailCars, NoAvailCars);
				break;
			case 5: System.out.println("Exiting...");
				break;
			}
			
		} while (opt != 5);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
