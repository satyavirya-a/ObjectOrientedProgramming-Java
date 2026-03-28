package main;

import java.util.*;

public class CoffeeMachine {
	private int air;
	private int susu;
	private int bijiKopi;
	private int gelas;
	private int uang;
	
	private ArrayList<Coffee> SuccessOrders = new ArrayList<>();
	
	public CoffeeMachine(int air, int susu, int bijiKopi, int gelas, int uang) {
		this.air = air;
		this.susu = susu;
		this.bijiKopi = bijiKopi;
		this.gelas = gelas;
		this.uang = uang;
	}

	public void printContents() {
		
		System.out.println("======Jumstart Machine Info =====");
		System.out.println("The coffee machine has:");
		System.out.println(air + " ml of water");
		System.out.println(susu + " ml of milk");
		System.out.println(bijiKopi + " g of coffee beans");
		System.out.println(gelas + " disposable cups");
		System.out.println(uang + " of money");
		System.out.println("==================================");
		
	}

	public void makeCoffee(Coffee c) {
		if (c.getAirNeed() > air) {
			System.out.println("Sorry, not enough water!");
			return;
		}
		
		if (c.getBijiKopiNeed() > bijiKopi) {
			System.out.println("Sorry, not enough coffee beans!");
			return;
		}
		
		//TODO tambah yang buat validasi lainnya 
		
		air -= c.getAirNeed();
		susu -= c.getSusuNeed();
		bijiKopi -= c.getBijiKopiNeed();
		gelas -= 1;
		uang += c.getPrice();
		
		SuccessOrders.add(c);
		
		System.out.print("Enough resources, making you ");
		//TODO tambahin huruf huruf lain
		if (c.getCoffeeName().startsWith("A") || c.getCoffeeName().startsWith("E") || c.getCoffeeName().startsWith("O") ) {
			System.out.println("an " + c.getCoffeeName().toLowerCase());
		}
			
		else {
			System.out.println("a " + c.getCoffeeName().toLowerCase());
		}
		
	}

	public void emptyCashRegister() {
		// TODO Auto-generated method stub
		System.out.println("Witdrawing " + uang);
		uang = 0;
	}

	public void fillMachine(int air, int susu, int bijiKopi, int gelas) {
		
		this.air += air;
		this.bijiKopi += bijiKopi;
		this.susu += susu;
		this.gelas += gelas;
		
	}

	public void printTransactionHistory() {
		int total = 0;
		System.out.println("== Jumpstart Machine Transaction ==");
		for (Coffee coffee : SuccessOrders) {
			System.out.println( coffee.getCoffeeName() + " - " + "$"+coffee.getPrice());
			total += coffee.getPrice();
		}
		
		System.out.println("Total : " + "$" + total);
		System.out.println("=====================================");
		
	}
	
	
	
}
