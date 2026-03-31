package models;

public class MagicItem extends Item{
	
	protected int magicDamage;

	public MagicItem() {
		// TODO Auto-generated constructor stub
	}

	public MagicItem(String name, int price, int magicDamage) {
		super(name, price);
		this.magicDamage = magicDamage;
		// TODO Auto-generated constructor stub
	}
	
	protected void getDetail() {
		System.out.println(name + " - " + price + " - Damage:" + magicDamage);
		
	}
	
	//bisa langsung overide pake shortcut
	
	public int calDamage(int level) {
		return level*magicDamage;
	}
	
	
}
