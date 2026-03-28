package models;

public class Customer {
	private String name;
	private String email;
	private int saldo;
	
	
	public Customer(String name, String email, int saldo) {
		this.name = name;
		this.email = email;
		this.saldo = saldo;
	}
	
	public Transaction bookTicket(Airport a, Flight f, int jumlahTicket, String jenis, Promo p) {
		
		Transaction t = new Transaction();
		
		return t;
	}
	
	
}
