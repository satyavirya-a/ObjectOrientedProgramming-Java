package models;

public class Plant {
	
	private String type;
	private String sciName;
	private String name;
	private int gTime;
	
	public Plant(String type, String sciName, String name, int gTime) {
		super();
		this.type = type;
		this.sciName = sciName;
		this.name = name;
		this.gTime = gTime;
	}
	
	public String getType() {
		return type;
	}



	public String getSciName() {
		return sciName;
	}



	public String getName() {
		return name;
	}



	public int getgTime() {
		return gTime;
	}



	public boolean isMature() {
		if (gTime == 0) {
			return true;
		}
		
		return false;
	}
	
	public void printData() {
		System.out.print(type + " - " + name + " - " + sciName + " - ");
		if (this.isMature()) {
			System.out.println("mature");
			return;
		}
		System.out.println("mature in " + gTime + " day(s)");
		
	}
	
	public void waterPlant() {
		gTime -= 1;
	}
	
	
	
}
