package main;

public class JNTShipping extends ShippingMethod {

	public JNTShipping() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processShipping(Customer c) {
		System.out.println("Shipping via J&T to " + c.address);	
	}
	
	
	

}
