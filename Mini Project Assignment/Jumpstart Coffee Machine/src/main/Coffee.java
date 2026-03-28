package main;

public class Coffee {
	private String CoffeeName;
	private int airNeed;
	private int susuNeed;
	private int bijiKopiNeed;
	private int price;
	
	public Coffee(String coffeeName, int airNeed, int susuNeed, int bijiKopiNeed, int price) {
		CoffeeName = coffeeName;
		this.airNeed = airNeed;
		this.susuNeed = susuNeed;
		this.bijiKopiNeed = bijiKopiNeed;
		this.price = price;
	}

	public String getCoffeeName() {
		return CoffeeName;
	}

	public int getAirNeed() {
		return airNeed;
	}

	public int getSusuNeed() {
		return susuNeed;
	}

	public int getBijiKopiNeed() {
		return bijiKopiNeed;
	}

	public int getPrice() {
		return price;
	}
	
	
	
	
}
