/*
 * Abstract Class -> Class yang tidak bisa dibuat object (tidak bisa di instance
 * 					-> keyword abstact class
 * 					-> single inheritance (cuma punya 1 parent)
 * 					-> tetep pake extends 
 * 
 * Abstract Method -> Method yang gak di implementasi
 * 
 * 
 * Inteface, tidak bisa di instanstion (gak bisa pake keyword "new")
	method -> pasti public abstract 
	atribut -> pasti public static final (makanya jarang di buat atribut, buat sistem behaviour)
	inheitance -> bisa multiple parent
 * 
 * Abstract Class gak wajib abstract method, bisa method biasa
 * Interface malah methodnya otomatis public abstract
 * 
 * 
 * Pake inteface apa engga atau malah pake abstract class
 * inheritence
 * jangan no access modifier
 * 
 */


package main;

import java.util.ArrayList;
import java.util.Scanner;

import models.Flower;
import models.Houseplant;
import models.Plant;
import models.Tree;

public class Main {

	public Main() {
		
		Scanner sc = new Scanner(System.in);
		
		//langsung kasih data dummy
		ArrayList<Plant> plants = new ArrayList<>();
		plants.add(new Flower("Nasi", "Goreng"));
		plants.add(new Houseplant("Nasi", 10));
		plants.add(new Tree("Nasi", 200));
		
		for (Plant plant : plants) {
			if (plant instanceof Prunable ) {
				((Prunable) plant).pruning();
			}
			else if (plant instanceof Waterable) {
				((Waterable) plant).watering();
			}
		}
			
		for (Plant plant2 : plants) {
			plant2.fertilizing();
		}
		
		
		int opt;
		do {
			System.out.println("Maintenance Schedule");
			System.out.println("========================");
			System.out.println("1. Watering");
			System.out.println("2. Pruning");
			System.out.println("3. Fertilizing");
			System.out.println("4. Exit");
			System.out.print(">> ");
			opt = sc.nextInt();
			sc.nextLine();
			switch (opt) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4: System.out.println("Exiting...");
				break;
			}
		} while (opt != 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pake keyword new karena Main itu constructor, makanya dipaggil harus pake new
		new Main();
	}

}
