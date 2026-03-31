package models;

//Class nya jangan lupa huruf KAPITAL
public class Character {
	protected String name, type;

	public Character(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public void showInfo() {
		System.out.println(name + " - " + type);
	}
	
	//overloading (di satu class sama, tapi parameter beda, return type bisa beda juga)
	public String showInfo(int level) {
		return name+" - "+type;
	}
}
