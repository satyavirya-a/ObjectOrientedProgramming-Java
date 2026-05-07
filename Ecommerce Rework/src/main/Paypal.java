package main;

public class Paypal extends PaymentMethod {

	public Paypal() {
		// TODO Auto-generated constructor stub
	}
	
	public void processPayment(Customer c, double total) {
		System.out.println("Processing PayPal payment for " + c.name);
        System.out.println("Charged: $" + total);
	}
}
