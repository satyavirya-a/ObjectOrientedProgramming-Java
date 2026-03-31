package models;

public abstract class Item {
	
	protected String name;
	protected int price;
	
	public Item() {
		
	}

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	protected abstract void getDetail();
	
	//kalau isi method nya mau kosong, jadi abstact method aja
	//otomatis class nya juga harus abstract (gak bisa dibuat pake constructor)
	//karena kalau method nya ada yang abstact, takutnya pas dipanggil mau dibuat apa dong ? 
	
	
	
	

}
