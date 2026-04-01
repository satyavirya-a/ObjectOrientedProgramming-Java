package lecture;

//PACKAGE (Mengelompokan Class) 
//cth
//Models
	//2D Shape
		//Shape.java
	//3D Shape
		//Shape.java //bisa buat di sini walau nama class sama

//BUILD-IN Package cth: java.util
import java.util.*;

import models.shape.Circle;
import models.shape.Shape;

import java.sql.*; //untuk konek ke data base
import java.lang.*; //gak usah import karena semua class adalah subclass dari java lang
import java.io.*; //untuk input output

//USER DEFINED Package
	/*mudah di maintanace, coupling rendah (hubungan antar class), cohesion 
		coupling rendah : saling independent
		cohesion high : hubungan di dalam class kompak gunanya buat apa
		
	*/
	//kalau di satu package yang sama, tidak perlu import

	/*
	 * INHERITANCE: Generalization 
	 */

	//SOAL CODING SEMUA

/*
 * ENCAPSULATION
 * - Data dibungkus class class supaya gak bisa diakses di luar 
 * 		public : bisa di akses dimana aja selama di java project yang sama
 * 		protected: bisa diakses di subclass (child class) tapi di folder lain
 * 		no access modifier: cuma bisa di package yang sama
 * 		private: cuma bisa di class yang sama
 * 
 * 		supaya tidak ke leak datanya
 * 		
 */


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sp1 = new Shape();
		//kalau method no access modifier tidak bisa diakses packag lain
		
		
		Circle c = Circle.getInstance(); //singleton
		
		
	}
	

}
