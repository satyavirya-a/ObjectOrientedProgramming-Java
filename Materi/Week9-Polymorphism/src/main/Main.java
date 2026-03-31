package main;
import java.util.ArrayList;

import models.*;
import models.Character;


public class Main {
	
	public Main() {
		
		//coba pakai overloading dari class Character
				int level = 1;
				Character c = new Character("Char1", "Player");
				System.out.println(c.showInfo(level));
				
				
				
				//guna nya bikin method getDetail di item apa ? padahal tiap MagicItem, PhysicalItem, Defense itu kan beda beda
				//Biar bikin array list general Item
				ArrayList<Item> items = new ArrayList<>();
				items.add(new MagicItem("Wand", 120, 10));
				
				//ambil salah satu magic item di arraylist items
//				items.get(0).calDamage()  KAGA ADA, harus di TYPE CASTING
				int damage = ((MagicItem)items.get(0)).calDamage(level); // Kalau ini downcasting dari super ke sub
				System.out.println(damage);
				
				
				//contoh upCasting (parent abstact, jadi buat dari subnya)
				Item item = new MagicItem("Crystal", 130, 10);
				
				int totalDamage = 0;
				int totalDefense = 0;
				
				for (Item item2 : items) {
					if (item2 instanceof MagicItem) {
						totalDamage += ((MagicItem) item2).calDamage(level);
						
					}
					
					else {
						totalDefense += ((DefenseItem)item2).calDefense(level);
					}
				}
				
				int damageTaken = totalDamage - totalDefense;
				System.out.println("Damage taken: " + damageTaken);
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();
		
		
	}

}
