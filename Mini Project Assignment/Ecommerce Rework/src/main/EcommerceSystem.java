package main;
import java.util.*;

class EcommerceSystem {
	private Inventory inventory = new Inventory();
   private PaymentSystem paymentSystem = new PaymentSystem();
   
   private double totalReveue = 0;
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
		   System.out.println("Error, tidak ketemu barang yang ingin dimasukan ke cart");
	   }
	   
   }
   
   public void showInventoryFromSystem() {
	   inventory.showInventory();
   }
   
   public void showCartFromSystem(Cart c) {
	   c.showCart();
   }
   
   public void checkOutFromSystem(Customer customer, Cart c, PaymentMethod payment, ShippingMethod shipping, NotificationMethod notif, Database db) {
	   paymentSystem.checkout(customer, c, payment, shipping, notif, db);
	   totalBarang += c.getProductCount();
	   totalReveue += c.calculateTotalBelanja();
   }
   
    
	public void printSalesReport() {
		System.out.println("===== SALES REPORT =====");
		System.out.println("Total items sold: " + totalBarang);
		System.out.println("Revenue: $" + totalReveue);
	}
}