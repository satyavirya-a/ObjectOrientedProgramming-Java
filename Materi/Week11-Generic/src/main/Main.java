package main;

import java.util.ArrayList;
import java.util.Queue;

//Kalau OOP (web, desktop, Mobile)
//Kalau Principle SOLID (biar dia kaga asal di buat di class tertentu doang
//Design Pattern MVC



//Generic Class itu kaya bikin template contoh Array List, data type nya khusus tapi
//dia buat data type sendiri
//Gak perlu typecasting, reuse code
//Menerapkan generic algo/konsep
//Key wordnya itu <>


//parent nya itu jadi wadah kalau di array list, jadi nanti pas di typecast, bisa akses sub classnya
/*
 * CTH:
 * Animal a = new Cat();
 * 
 * a itu punya method dan atributnya cat, tapi disimpen sebagai animal
 * 
 * kalau mau dibuat jadi cat lagi bisa, dengan cara di type cast
 */
public class Main {

	public Main() {
		
		ArrayList city = new ArrayList();
		//ini array list biasa dengan element object (kaga tahu ni data type nya apa, jadi JELEK)
		
		//CONTOH buat class generic sendiri dengan data type element kita declare sendiri
		Pair<String, Integer> p1  = new Pair<String, Integer>("Jojo", 100);
		p1.printData();
		
		MyQueue<Pair<String, Integer>> queue = new MyQueue<>();
		queue.enqueue(p1);
		
		queue.enqueue(new Pair<String,Integer>("Lili", 100));
		
		queue.peek().printData();
		
		
		//contoh pakai generic method
		AnotherPair s3 = new AnotherPair("Bibi", 85);
		s3.<String>print("Ini String");
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
