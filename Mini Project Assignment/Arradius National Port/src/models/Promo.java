package models;

public class Promo {
	
	private String name;
	private String classFlight;
	private int stock;
	private String type;
	private int amount;
	
	public Promo(String name, String classFlight, int stock, String type, int amount) {
		super();
		this.name = name;
		this.classFlight = classFlight;
		this.stock = stock;
		this.type = type;
		this.amount = amount;
	}
	
	public void addPromoAvailibility(int stock) {
		this.stock += stock;
	}
	

}
