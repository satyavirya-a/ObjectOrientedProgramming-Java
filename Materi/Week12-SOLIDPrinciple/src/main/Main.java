package main;

//SOLID Principle
/*
 * 1. Single Responsibility: Satu Class/Method hanya boleh 1 purpose atau tanggung jawab
 * Solusi: Pecah class / Method (Modular, Readable, Stable)
 * 
 * 2. Open/Close: Open for Extend (jadi jangan di edit, tapi diextend) & jangan di edit kalau ada update
 * 					Biasanya kebanyakan else if, else if
 * Solusi: Interface & Abstract Class (kurangi else if, else if)
 * 3. Liskov Substitution: Kalau extend jangan maksa, Kalau buat sub class harus behaviour nya sama dengan sub class lainnnya
 * Solusi: buat parent class baru yang lebih menggambarkan kelompok subclass atau pakai parent interface
 * 
 * 4. Interface Segregation: interface itu pisah pisah, jangan general (Kalau class implement interface, harus bisa implementasi semua method di interface
 * Solusi: pecah interface
 * 
 * 5. Dependency Inversion: design depend on abstract class/interface bukan concrete class)
 * 							jangan harcode dependency
 * 							Ciri-ciri:
 * 							- Buat object concrete langsung di tiap method, padahal bisa digabung pakai abstract atau interface
 * 							- Atribut yang ngambil langsung dari concrete class (class yang bukan subclass atau abstract) (ngambil langsung itu jadi parameter atau jadi atribut)
 * Solusi: buat abstract class/interface biar berelasi (buat atribut, jadi parameter, atau inheritence) ke abstract/interfase 
 *
 */

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		new Main();
	}

}
