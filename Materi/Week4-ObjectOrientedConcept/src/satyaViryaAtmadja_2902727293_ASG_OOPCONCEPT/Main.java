package satyaViryaAtmadja_2902727293_ASG_OOPCONCEPT;

import java.util.*;


public class Main {
	//buat data array list nya
		ArrayList<GroceryStore> Stores = new ArrayList<>();
		
		public boolean StoreIdNotInList(String idTar) {
			for (GroceryStore gs : Stores) {
				if (idTar.equals(gs.id)) {
					return false;
				}
			}
			return true;
		}
		
		
		
		
		
		public void addStore(Scanner sc) {
			String name;
			String id;
			int maxItems;
			System.out.println("Insert New Grocery");
			System.out.println();
			
			do {
				System.out.print("Name: ");
				name = sc.nextLine();
				if (name.isBlank()) {
					System.out.println("Name tidak boleh kosong");
				}
			} while (name.isBlank());
			
			do {
				System.out.print("id: ");
				id = sc.nextLine();
				if (!(StoreIdNotInList(id))) {
					System.out.println("Id tidak unique");
				}
				if (id.isBlank()) {
					System.out.println("Id tidak boleh kosong");
				}
			} while (!(StoreIdNotInList(id)) || id.isBlank());
			
			System.out.print("Max Items: ");
			maxItems = sc.nextInt();
			sc.nextLine();
					
			GroceryStore newStore = new GroceryStore(id, name, maxItems);
			Stores.add(newStore);
			System.out.println("Data berhasil dimasukkan");
			sc.nextLine();
		}
		

		public void viewAll(Scanner sc) {
			System.out.println("View Grocery Store");
			if (Stores.isEmpty()) {
				System.out.println("Data Kosong");
				return;
			}
			for (GroceryStore groceryStore : Stores) {
				groceryStore.viewDataStore();
				groceryStore.viewItems();
				
			}
			sc.nextLine();
		}
		
		public int chooseStore(Scanner sc, String str) { //tampilkan data store dan angka
			if (Stores.isEmpty()) {
				System.out.println("Data Kosong, silahkan insert data dulu");
				sc.nextLine();
				return -1 ;
			}
			int i = 1;
			System.out.println("Pilih Grocery yang Ingin" + str + ": ");
			for (GroceryStore groceryStore : Stores) {
				
				System.out.println(i++ + ". (Id: " + groceryStore.id + ") " + groceryStore.name + " Grocery Store");
				
			}
			
			//pilih mau taruh dimana?
			String idTar;
			int idxTar = -1;
			do {
				System.out.print("Id Grocery: ");
				idTar = sc.nextLine();
				if (StoreIdNotInList(idTar)) {
					System.out.println("Id tidak ada");
				}
				if (idTar.isBlank()) {
					System.out.println("Id tidak boleh kosong");
				}
			} while (StoreIdNotInList(idTar) || idTar.isBlank()); //cari di array dulu
			
			for (GroceryStore groceryStore : Stores) {
				if (idTar.equals(groceryStore.id)) {
					idxTar = Stores.indexOf(groceryStore);
				}
				
			}
			
			return idxTar;
		}
		
		
		public void addItem(Scanner sc) {
			
			//tampilin semua grocery dulu
			System.out.println("Insert New Item");
			System.out.println();			
			
			int idx = chooseStore(sc, "Ditambah Itemnya");
			if (idx == -1) {
				return;
			}
				
			//lakukan validasi penuh atau tidak dulu
			if (Stores.get(idx).storeIsFull()) {
				return;
			}
			
			System.out.println("Insert New Item Data");
			Item temp = new Item();
			
			do {
				System.out.print("Nama: ");
				temp.name = sc.nextLine();
				if (temp.name.isBlank()) {
					System.out.println("Nama tidak boleh kosong");
				}
			} while (temp.name.isBlank());
			
			do {
				System.out.print("Brand: ");
				temp.brand = sc.nextLine();
				if (temp.brand.isBlank()) {
					System.out.println("Brand tidak boleh kosong");
				}
			} while (temp.brand.isBlank());
			
			
			do {
				System.out.print("Id: "); 
				temp.id = sc.nextLine();
				if (!(Stores.get(idx).ItemIdNotInList(temp.id))) {
					System.out.println("Id tidak unique");
				}
				if (temp.id.isBlank()) {
					System.out.println("Id tidak boleh kosong");
				}
			} while(!(Stores.get(idx).ItemIdNotInList(temp.id)) && temp.id.isBlank());
			
			do {
				System.out.print("Harga: ");
				temp.price = sc.nextDouble();
				sc.nextLine();
				if (temp.price <= 0) {
					System.out.println("Harga tidak boleh nol");
				}
			} while (temp.price <= 0);
			
			
			do {
				System.out.print("Quantity: ");
				temp.qty = sc.nextInt();
				sc.nextLine();
				if (temp.qty <= 0) {
					System.out.println("Quantity tidak boleh nol");
				}
			} while (temp.qty <= 0);
			
			
			Stores.get(idx).addItem(temp);
			System.out.println("Data berhasil dimasukkan");
			sc.nextLine();
			
		}
		
		public void updateStore(Scanner sc) {
			System.out.println("Update Data Grocery Store");
			System.out.println();
			
			
			int idx = chooseStore(sc, "Diupdate");
			if (idx == -1) {
				return;
			}
			
			String newName;
			do {
				System.out.print("Nama Grocery " + Stores.get(idx).name + " Baru: ");
				newName = sc.nextLine();
				if (newName.isBlank()) {
					System.out.println("Nama tidak boleh kosong");
				}
			} while (newName.isBlank());
			
			
			Stores.get(idx).updateStoreName(newName);
			
			System.out.println("Data berhasil diupdate");
			sc.nextLine();
			
		}
		
		public void updateItem(Scanner sc) {
			System.out.println("Update Data Item");
			
			System.out.println();
			
			//pilih grocery store dulu
			int idx = chooseStore(sc, "Data Itemnya diganti");
			if (idx == -1) {
				return;
			}
			
			
			
			
			//pilih item yang mau diganti
			//tampilin data item yang ada di grocery tersebut
			int j = 1;
			for (Item item : Stores.get(idx).Items) {
				System.out.println(j++ + ". (Id: "+ item.id +") Name: " + item.name);
			}
			
			String idTar;
			do {
				System.out.print("Pilih Id item yang mau diupdate: ");
				idTar = sc.nextLine();
				if (Stores.get(idx).ItemIdNotInList(idTar)) {
					System.out.println("Id tidak ada di list");
				}
				if (idTar.isBlank()) {
					System.out.println("Id tidak boleh kosong");
				}
			} while (idTar.isBlank() || Stores.get(idx).ItemIdNotInList(idTar)); 
			int idxItemTar = Stores.get(idx).searchItem(idTar);
			

			
			
			//tampilin data item yang mau diganti
			System.out.println("Data Item yang dipilih: ");
			Item tar = Stores.get(idx).Items.get(idxItemTar);
			tar.viewDataItem();
			//Bisa dengan remove trus insert yang baru juga cuma jadi gak berurutan
			
			String tempName;
			String tempBrand;
			double tempPrice;
			int tempqty;
			System.out.println("Masukan data baru:");
		
			do {
				System.out.print("Nama: ");
				tempName = sc.nextLine();
				if (tempName.isBlank()) {
					System.out.println("Nama tidak boleh kosong");
				}
			} while (tempName.isBlank());
			
			do {
				System.out.print("Brand: ");
				tempBrand = sc.nextLine();
				if (tempBrand.isBlank()) {
					System.out.println("Brand tidak boleh kosong");
				}
			} while (tempBrand.isBlank());
		
			String tempId;
			do {
				System.out.print("id: ");
				tempId = sc.nextLine();
				if (!(Stores.get(idx).ItemIdNotInList(tempId))) {//gak boleh ada di list
					System.out.println("Masukan id unique");
				}
			} while(!(Stores.get(idx).ItemIdNotInList(tempId)));
		
			do {
				System.out.print("Harga: ");
				tempPrice = sc.nextDouble();
				sc.nextLine();
				if (tempPrice <= 0) {
					System.out.println("Harga tidak boleh nol");
				}
			} while (tempPrice <= 0);
			
			
			do {
				System.out.print("Quantity: ");
				tempqty = sc.nextInt();
				sc.nextLine();
				if ( tempqty <= 0) {
					System.out.println("Quantity tidak boleh nol");
				}
			} while (tempqty <= 0);
			
			tar.updateDataItem(tempName, tempBrand, tempId, tempPrice, tempqty);
			System.out.println("Data berhasil di update");
			sc.nextLine();
			
		}
		
		public void deleteStore(Scanner sc) {
			System.out.println("Delete Data Grocery Store");
			System.out.println();
			
			
			int idx = chooseStore(sc, "Dihapus");
			if (idx == -1) {
				return;
			}
			
			Stores.remove(idx);
			
			System.out.println("Data berhasil di delete");
			sc.nextLine();
		}
		
		public void deleteItem(Scanner sc) {
			System.out.println("Delete Data Item Grocery");
			System.out.println();
			
			
			int idx = chooseStore(sc, "Dihapus Itemnya");
			if (idx == -1) {
				return;
			}
			
			int j = 1;
			for (Item item : Stores.get(idx).Items) {
				System.out.println(j++ + ". Name (id = "+ item.id +") : " + item.name);
			}
			
			//input id yang jadi target
			String idTar;
			do {
				System.out.print("Pilih Id item yang mau dihapus: ");
				idTar = sc.nextLine();
				if (Stores.get(idx).ItemIdNotInList(idTar)) {
					System.out.println("Id tidak ada di list");
				}
				if (idTar.isBlank()) {
					System.out.println("Id tidak boleh kosong");
				}
			} while (idTar.isBlank() || Stores.get(idx).ItemIdNotInList(idTar)); 
			
			int idxItemTar = Stores.get(idx).searchItem(idTar);
			
			Stores.get(idx).removeItem(idxItemTar);
			
			sc.nextLine();
		}
		
		public void deleteStoreandItem(Scanner sc) {
			System.out.println("Delete Store and Item");
			System.out.println();
			String hal;
			do {
				System.out.print("Pilih hal yang ingin dihapus [Store | Item]:");
				hal = sc.nextLine();
				if (!(hal.equals("Store")) && !(hal.equals("Item"))) {
					System.out.println("Pilih ulang");
				}
			} while (!(hal.equals("Store")) && !(hal.equals("Item")));
			
			if (hal.equals("Store")) {
				deleteStore(sc);
			}
			else if (hal.equals("Item")) {
				deleteItem(sc);
			}
			
		}
	
	
	public Main() {
		Scanner sc = new Scanner(System.in);
		int opt;
		
		do {
			System.out.println("Grocery Stores Management");
			System.out.println("1. Insert New Grocery");
			System.out.println("2. Insert New Item");
			System.out.println("3. Display Grocery and Items");
			System.out.println("4. Update Grocery");
			System.out.println("5. Update Item Info");
			System.out.println("6. Remove Store and Item" );
			System.out.println("7. Exit");
			System.out.print(">> ");
			try {
				opt = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				opt = 0;
				sc.nextLine();
				
			}
			
			switch (opt) {
				case 1: addStore(sc);
					break;
				case 2: addItem(sc);
					break;
				case 3: viewAll(sc);
					break;
				case 4: updateStore(sc);
					break;
				case 5: updateItem(sc);
					break;
				case 6: deleteStoreandItem(sc);
					break;
				case 7:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Input salah, coba lagi");
				
			}
			
		} while (opt != 7);
		
		
		
		
		sc.close();
	}

	public static void main(String[] args) {
		new Main();

	}
	
	

}


