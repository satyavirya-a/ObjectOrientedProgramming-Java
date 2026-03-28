package satyaViryaAtmadja_2902727293_ASG_OOPCONCEPT;

public class Item {
	
	String id, name, brand;
	double price;
	int qty;
	
	public void viewDataItem() {
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Brand: "+ this.brand);
		System.out.println("Price: " + this.price);
		System.out.println("Quantity: " + this.qty);
	}
	
	public void updateDataItem(String name, String brand, String id, double price, int qty) {
		this.name = name;
		this.brand = brand;
		this.id = id;
		this.price = price;
		this.qty = qty;
	}
	

}
