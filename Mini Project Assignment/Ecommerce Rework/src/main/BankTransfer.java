package main;

public class BankTransfer extends PaymentMethod {

	public BankTransfer() {
		// TODO Auto-generated constructor stub
	}
	
	public void processPayment(Customer c, double total) {
		System.out.println("Processing Bank Transfer payment for " + c.name);
        System.out.println("Charged: $" + total);
	}

}
