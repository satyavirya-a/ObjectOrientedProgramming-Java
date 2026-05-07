package main;

public abstract class PaymentMethod {

	public PaymentMethod() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void processPayment(Customer c, double total);
}
