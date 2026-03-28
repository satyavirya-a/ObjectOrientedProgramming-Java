package main;
import models.*;


import java.util.*;





public class Main {
	
	ArrayList<Plant> plants = new ArrayList<>();
	
	public void menuInsertPlant(Scanner sc) {
		String name;
		String sciName;
		String type;
		int gTime;
		
		do {
			System.out.print("Type (Flower/Tree/Houseplant): ");
			type = sc.nextLine();
		} while ( !(type.equals("Flower")) && !(type.equals("Tree")) &&  !(type.equals("Houseplant")));
		
		do {
			System.out.print("Scientific name (5-30 characters): ");
			sciName = sc.nextLine();
		} while ( sciName.length() < 5 || sciName.length() > 30);
		
		do {
			System.out.println("Type diatas " + type);
			System.out.print("Name (end with " + type + "): ");
			name = sc.nextLine();
		} while (!(name.endsWith(type)));
		
		do {
			System.out.print("Growth time (1-10 day(s)): ");
			gTime = sc.nextInt();
			sc.nextLine();
		} while (gTime < 1 || gTime > 10);
		
		
		Plant p = new Plant( type,  sciName,  name,  gTime);
		
		plants.add(p);
		
		System.out.println("Plant is successfully inserted!");
		
		
	}
	
	
	public void menuView(Scanner sc) {
		String type;
		System.out.print("Choose type (All/Flower/Tree/Houseplant): ");
		type = sc.nextLine();
		
		if (plants.isEmpty()) {
			System.out.println("No plants!");
			return;
		}
		
		if (type.equalsIgnoreCase("All")) {
			for (Plant plant : plants) {
				plant.printData();
			}
			return;
		}
		
		else if (type.equalsIgnoreCase("Flower")) {
			int isNone = 1;
			for (Plant plant : plants) {
				
				if (plant.getType().equals("Flower")) {
					isNone = 0;
					plant.printData();
				}
			}
			
			if (isNone == 1) {
				System.out.println("No plants");
			}
			return;
		}
		
		else if (type.equalsIgnoreCase("Tree")) {
			int isNone = 1;
			for (Plant plant : plants) {
				if (plant.getType().equals("Tree")) {
					isNone = 0;
					plant.printData();
				}
			}
			if (isNone == 1) {
				System.out.println("No plants");
			}
			return;
		}
		
		else if (type.equalsIgnoreCase("Houseplant")) {
			int isNone = 1;
			
			for (Plant plant : plants) {
				if (plant.getType().equals("Houseplant")) {
					isNone = 0;
					plant.printData();
				}
			}
			
			if (isNone == 1) { 
				System.out.println("No plants");
			}
			
			
			return;
		}
	}
	
	public void menuDelete(Scanner sc) {
		
		if (plants.isEmpty()) {
			System.out.println("No plants!");
			return;
		}
		
		int i = 1;
		
		for (Plant plant : plants) {
			System.out.printf("%2d. ", i++);
			plant.printData();
		}
		
		int num;
		do {
			System.out.print("Choose plant to delete (1-" + plants.size() + "): ");
			num = sc.nextInt();
		} while (num < 1 || num > plants.size() );
		
		plants.remove(num-1);
		
		System.out.println("Plant is removed successfully!");
	}
	
	
	public void menuWater(Scanner sc) {
		
		if (plants.isEmpty()) {
			System.out.println("No plants!");
			return;
		}
		
		int i = 1;
		
		for (Plant plant : plants) {
			System.out.printf("%2d. ", i++);
			plant.printData();
		}
		
		
		int num;
		do {
			System.out.print("Choose plant to water (1-" + plants.size() + "): ");
			num = sc.nextInt();
		} while (num < 1 || num > plants.size() );
		
		plants.get(num-1).waterPlant();
		
		System.out.println("Plant is watered successfully!");
	}
	
	public Main() {
		
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		
		do {
			System.out.println("--Binus Plant Collections--");
			System.out.println("1. View Plants");
			System.out.println("2. Insert Plant");
			System.out.println("3. Delete Plant");
			System.out.println("4. Water Plants");
			System.out.println("5. Exit");
			System.out.print(">> ");
			try {
				opt = sc.nextInt();
			} catch (Exception InputMismatchException) {
				sc.nextLine();
				System.out.println("Input angka woi");
				continue;
				
			}
			sc.nextLine();
			switch (opt) {
				case 1: menuView(sc);
					break;
				case 2: menuInsertPlant(sc);
					break;
				case 3: menuDelete(sc);
					break;
				case 4: menuWater(sc);
					break;
				case 5:
					break;
				default: System.out.println("Pilih lagi");
			}
	
		} while (opt != 5);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m = new Main();
		
		
		
	}



}
