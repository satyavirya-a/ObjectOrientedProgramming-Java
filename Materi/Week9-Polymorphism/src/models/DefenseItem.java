package models;

public class DefenseItem extends Item {
	
	public int defense;
	
	public DefenseItem() {
		
	}

	public DefenseItem(String name, int price, int defense) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.defense = defense;
	}



	@Override
	protected void getDetail() {
		// TODO Auto-generated method stub
		System.out.println(name + " - " + price + " - defense: " + defense);
		
		
	}
	
	public int calDefense(int level) {
		return level*defense+2;
	}
	
	

}
