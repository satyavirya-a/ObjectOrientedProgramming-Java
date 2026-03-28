package models.shape;

public class Circle extends Shape{ //circle adalah subclass dari shape, semua atribut dari parent bakal dipunyai 
									//ASAL tidak private
	
	static Circle c; //kalau object buat di main, dia bakal ngerujuk ke c juga, jadi gak buat yang baru
	
	public static Circle getInstance() { //pattern single ton, buat akses database, 
										 //biar cuma buat object cuma sekali, gak new database berkali kali
		if (c == null) c = new Circle();
		return c;
	}
	
	private Circle() {
	
	}

}
