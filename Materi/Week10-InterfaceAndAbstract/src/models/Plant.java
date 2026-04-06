package models;

public abstract class Plant {
	
	protected String name;

	public Plant() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Plant(String name) {
		super();
		this.name = name;
	}

	public abstract void fertilizing();

}
