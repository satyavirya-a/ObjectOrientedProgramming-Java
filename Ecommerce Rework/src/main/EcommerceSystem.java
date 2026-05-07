package main;
import java.util.*;

class EcommerceSystem {
	private Inventory inventory = new Inventory();
   private PaymentSystem paymentSystem = new PaymentSystem();
   
   private int totalReveue = 0;
   private int totalBarang = 0;
    
   public void addProductToSystem(Product p) {
	   inventory.addProduct(p);
   }
   
   public void addProductToCart(Cart c, String productName) {
	   Product foundProduct = inventory.searchProduct(productName);
	   
	   if (foundProduct != null) {
		   c.addToCart(foundProduct);
	   }
	   else {
		   System.out.println("Error, tidak ketemu");
	   }
	   
   }
   
   public void showInventoryFromSystem() {
	   inventory.showInventory();
   }
   
   public void showCartFromSystem(Cart c) {
	   c.showCart();
   }
   
   public void checkOutFromSystem(Customer customer, Cart c, PaymentMethod payment, ShippingMethod shipping, NotificationMethod notif) {
	   paymentSystem.checkout(customer, c, payment, shipping, notif);
	 
   }
   
    
	public void printSalesReport() {
		System.out.println("===== SALES REPORT =====");
		System.out.println("Total items sold: " + totalBarang);
		System.out.println("Revenue: $" + totalReveue);
	}
}