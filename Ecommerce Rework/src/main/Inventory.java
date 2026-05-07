package main;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	private List<Product> inventory;

	public Inventory() {
		inventory = new ArrayList<>();
	}
	
	public void addProduct(Product p) {
		inventory.add(p);
		System.out.println( p.getClass().getSimpleName() + " product added: " + p.name);
	}
	
//	public void addElectronicsProduct(String name, double price, int warrantyMonths) {
//        Product p = new Electronics(name, "Electronics", price, "Warranty: " + warrantyMonths + " months");
//        inventory.add(p);
//        System.out.println("Electronics product added: " + name);
//    }
//
//    public void addFoodProduct(String name, double price, String expiryDate) {
//        Product p = new Food(name, "Food", price, "Expiry: " + expiryDate);
//        inventory.add(p);
//        System.out.println("Food product added: " + name);
//    }
//
//    public void addFashionProduct(String name, double price, String size) {
//        Product p = new Fashion(name, "Fashion", price, "Size: " + size);
//        inventory.add(p);
//        System.out.println("Fashion product added: " + name);
//    }
    
    public void showInventory() {
        System.out.println("===== INVENTORY =====");
        for (Product p : inventory) {
        		p.printInfo();
        }
    }
    
    public Product searchProduct(String productName) {
    		for (Product product : inventory) {
			if (product.name.equalsIgnoreCase(productName)) {
				return product;
			}
		}
    		return null;
    }
    

}
