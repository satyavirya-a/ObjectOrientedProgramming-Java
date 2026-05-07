package main;

public class SiCepatShipping extends ShippingMethod {

	public SiCepatShipping() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processShipping(Customer c) {
		System.out.println("Shipping via SiCepat to " + c.address);
	}

}
