package main;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Product> products = new ArrayList<>();

	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	public void addToCart(Product p) {
        products.add(p);
        System.out.println(p.name + " added to cart.");
    }

    public void removeFromCart(String productName) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(productName)) {
                products.remove(p);
                System.out.println(productName + " removed from cart.");
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

    public void showCart() {
        System.out.println("===== CART =====");
        for (Product p : products) {
            System.out.println(p.name + " - $" + p.price);
        }
    }
    
	public double calculateTotalBelanja() {
	  double total = 0;
	  for (Product p : products) {
	      total += p.price;
	  }
	  return total;
	}
    
	public int getProductCount() {
		return products.size();
	}

	public List<Product> getCartList() {
		return products;
	}
    

}
