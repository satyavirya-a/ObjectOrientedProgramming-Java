package models;

public class Beverage {
	
//	selama dia gak private, atribut dan method akan diwarisi
	//selama dalam 1 package yang sama, bisa diakses walau private dan access modifier lainnya
	
	//GAK BOLEH PUNYA LEBIH DARI SATU PARENT
	
	//kalau parent nya interface, itu child nya pakai implement
	
	private String name;
	private double price;
	
	public Beverage(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.print(name + " - " + price);
	}
	
//	@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return price +"\n"+ name;
//		}

	
	
}
