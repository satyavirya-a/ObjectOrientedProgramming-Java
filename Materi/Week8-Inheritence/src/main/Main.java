package main;

import java.util.ArrayList;
import java.util.Scanner;

import models.Beverage;
import models.Coffee;
import models.Juice;
import models.Tea;

public class Main {
	
	ArrayList<Beverage> beverages = new ArrayList<>();
	
	
	public void viewBeverages(Scanner sc) {
		System.out.println("View Menu");
		int i = 1;
		for (Beverage beverage : beverages) {
			System.out.print(i+++ ". ");
			beverage.printInfo();
		}
	}
	
	public void insertMenu(Scanner sc) {
		String nama;
		double price;
		
		String type;
		System.out.println("Menu Insert");
		System.out.print("Pilih Jenis Beverage yang ingin diinsert [Coffee | Juice | Tea]: ");
		type = sc.nextLine();
		System.out.print("Masukan Nama: ");
		nama = sc.nextLine();
		System.out.print("Masukan Price: ");
		price = sc.nextDouble();
		sc.nextLine();
		
		if (type.equals("Coffee")) {
			String beanType;
			System.out.print("Masukan BeanType: ");
			beanType = sc.nextLine();
			
			
			
			beverages.add(new Coffee(nama, price, beanType));
		}
		
		
		else if (type.equals("Tea")) {
			String teaType;
			System.out.print("Masukan TeaType: ");
			teaType = sc.nextLine();
			
			
			
			beverages.add(new Tea(nama, price, teaType));
		}
		
		else if (type.equals("Juice")) {
			String fruit;
			System.out.print("Masukan Fruit: ");
			fruit = sc.nextLine();
			
			
			
			beverages.add(new Juice(nama, price, fruit));
		}
		
		
	}
	
	public void deleteMenu(Scanner sc) {
		int idx;
		System.out.println("Menu Delete");
		viewBeverages(sc);
		System.out.print("Masukan index yang mau didelete:");
		idx = sc.nextInt();
		beverages.remove(idx -1);
	}
	
	public Main() {
		
		Scanner sc = new Scanner(System.in);
		
		beverages.add(new Juice("IkanJus", 10000, "NasiFruit"));
		beverages.add(new Tea("IkanTea", 3000, "NasiTea"));
		beverages.add(new Coffee("IkanCoffee", 200, "NasiCoffee"));
		
		int opt;
		
		do {
			System.out.println("BEVERAGE SHOP");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. View");
			System.out.println("4. Exit");
			System.out.print(">> ");
			opt = sc.nextInt();
			sc.nextLine();
			switch (opt){
			case 1: insertMenu(sc);
				break;
			case 2: deleteMenu(sc);
				break;
			case 3: viewBeverages(sc);
				sc.nextLine();
				break;
			case 4: System.out.println("Exiting...");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opt);
			}
		} while (opt != 4);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
