package materiDanContohVehicle;


public class Vehicle {
	public int roda; //KALAU PENGEN BISA DI TURUNIN DI BEDA PACKAGE , HARUS PUBLIC
					// KALAU DI DALAM PACKAGE YANG SAMA YA BISA BISA AJA
	public String name;
	
	public Vehicle(int roda, String name) {
		super();
		this.roda = roda;
		this.name = name;
	}
	
	
	
	public void gas() {
		System.out.println(name + " jalan...");
	}
	
	public void rem() {
		System.out.println(name+ " berhenti...");
	}
	
	public void printInfo() {
		System.out.println(name + " - " + roda);
	}
	


	
}
