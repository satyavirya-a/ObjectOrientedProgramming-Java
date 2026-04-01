package satyaViryaAtmadja_2902727293_ASG_OOPCONCEPT;

import java.util.*;
	




public class GroceryStore {
	
	String id, name;
	final int maxItems;
	//ARRAY LIST TETEP DIKASIH ACCESS MODIFIER
	public ArrayList<Item> Items = new ArrayList<>();
	
	
	//shortcut, generate constructor by fields
//	public GroceryStore(String id, String name, int maxItems) {
//		this.id = id;
//		this.name = name;
//		this.maxItems = maxItems;
//	}
	
	public GroceryStore(String id, String name, int maxItems) {
		this.id = id;
		/*
		 * kalau idnya mau random tiap buat grocerystore baru, langsung generate
		 * this.id = generateID();
		 * gak pake this gak papa, kalau gak ambigu
		 */
		
		
		this.name = name;
		this.maxItems = maxItems;
		
		/*
		 * Design Class
		 * Logic
		 * Atribut
		 */
	}
	
	
	public void updateStoreName(String newName) {
		this.name = newName;
	}
	
	

	public void viewDataStore() {
		System.out.println("============================");
		System.out.println("Nama Store: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Max Item Number: " + this.maxItems);
	}
	
	public boolean storeIsFull() {
		if (Items.size() == maxItems) {
			System.out.println("Maaf, Store sudah penuh, tidak bisa dimasukan item baru");
			return true;
		}
		else {
			return false;
		}
	}
	
	

	public void addItem(Item it) {
		if (storeIsFull()) {
			System.out.println("tidak bisa di add karena penuh");
		}
		else {
			Items.add(it);
			System.out.println("Success add items");
		}
	}
	
	public void removeItem(int idxTar) {
		if (Items.size() == 0) {
			System.out.println("Barang di toko sudah habis");
		}
		else {
			if (idxTar >= 0 && idxTar < Items.size()) {
				Items.remove(idxTar);
				System.out.println("Success remove items");
			}
			else {
				System.out.println("Barang tidak ditemukan");
			}
		
		}
	}
	
	public void viewItems() {
		if (Items.isEmpty()) {
			System.out.println("---------------------");
			System.out.println("Data Item Kosong");
		}
		else {
			int j = 1;
			for (Item item : Items) {
				System.out.println("---------------------");
				System.out.println("Item" + j++ + ":");
				item.viewDataItem();
			}
		}
	}
	
	public int searchItem(String idTar) {
		
		for (Item item : Items) {
			if (idTar.equals(item.id)) {
				return Items.indexOf(item);
			}
		}
		return -1;
	}
	
	public boolean ItemIdNotInList(String idTar) {
		for (Item it: Items) {
			if (idTar.equals(it.id)) {
				return false;
			}
		}
		return true;
	}
	
	
	//kalau misal random
	private String generateID() {
		Random r = new Random();
		int num = r.nextInt(1000);
		id = String.format("GR%03d", num);
		return id;
	}
	

}
