package models;


public class Coffee extends Beverage {
	
	private String beanType;

	public Coffee(String name, double price, String beanType) {
		super(name, price);
		this.beanType = beanType;
	}

	
	//bisa pakai toString
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString()+beanType;
//	}
	
	@Override
	public void printInfo() {
		super.printInfo(); 
		System.out.println(" - " + beanType);
	}

}
