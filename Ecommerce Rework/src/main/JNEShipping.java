package main;

public class JNEShipping extends ShippingMethod {

	public JNEShipping() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void processShipping(Customer c) {
		System.out.println("Shipping via JNE to " + c.address);
	}
	
	

}
