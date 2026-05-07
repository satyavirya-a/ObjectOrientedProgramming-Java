package main;

public class CreditCard extends PaymentMethod {

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	
	public void processPayment(Customer c, double total) {
		System.out.println("Processing Credit Card payment for " + c.name);
        System.out.println("Charged: $" + total);
	}

}
