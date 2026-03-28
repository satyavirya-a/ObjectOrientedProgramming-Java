package AssignemetWeek3;

import java.util.*;

public class SatyaViryaAtmadja2902727293GroceryMagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kalau remove kaga ada kembali ke menu
		//view juga kalau kaga ada, kembali
		//yang harus ngulang ngulang itu cuma add
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> items = new ArrayList<>();
		
		int opt = 0;
		do {
			System.out.println("Grocery Managenet");
			System.out.println("1. Add Item");
			System.out.println("2. Remove Item");
			System.out.println("3. Seach Item");
			System.out.println("4. View List");
			System.out.println("5. Exit");
			System.out.print(">> ");
			try {
				opt = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				opt = 0;
				sc.nextLine();
			}
			
			switch (opt) {
			case 1:
				String insertIn;
				do {
					
					System.out.print("Enter item name: ");
					insertIn = sc.nextLine();
					insertIn = insertIn.trim(); //bisa digabungin nextLine().trim()
					if (insertIn.length() == 0) {
						System.out.println("Nama Item tidak boleh kosong");
					}
					else if (items.contains(insertIn)) {
						System.out.println("Item already exists!");
					}
				} while(insertIn.isEmpty() || items.contains(insertIn));
				
				items.add(insertIn);
				System.out.println("Item added!, enter to back to menu");
				sc.nextLine();
				
				
				break;
			case 2:
				String removeIn;
					
				System.out.print("Enter item to remove: ");
				removeIn = sc.nextLine();
				int isExist = 0;
				//Cara Langsung
//				if (items.remove(removeIn)) {
//	
//					System.out.println(removeIn + " removed!");
//				}
//				else {
//					System.out.println("Item not found");
//				}
				//atau bisa langsung pakai for biasa
				for (String s : items) {
					if (removeIn.equals(s)) {
						isExist = 1;
					}
				}
				if (isExist == 0) {
					System.out.println("Item not found!");
				}
				else {
					items.remove(removeIn);
					System.out.println(removeIn + " removed!");
				}
				
				
				sc.nextLine();
				break;
			case 3:
				String searchIn = null;
				int isExist2 = 0;
				System.out.print("Enter search keyword: ");
				searchIn = sc.nextLine();
				System.out.println("Search result:");
				for (String s : items) {
					if (s.startsWith(searchIn)) {
						isExist2 = 1;
						System.out.println("- " + s);
					}
				}
				
				if (isExist2 == 0) {
					System.out.println("No items match your search.");
				}
				sc.nextLine();
				
				break;
			case 4:
				if (items.size() == 0) {
					System.out.println("List anda Kosong, enter untuk kembali ke menu");
					sc.nextLine();
					continue;
				}
				System.out.println("Your Grocery List:");
				int i = 1;
				for (String s : items) {
					System.out.println(i + ". " + s);
					i++;
				}
				
				System.out.println("Total items: " + items.size());
				sc.nextLine();
				break;
			case 5: 
				System.out.println("Exiting...");
				break;
			default: 
				System.out.println("Input salah coba lagi");
				sc.nextLine();
				break;
			}
			
			
		} while(opt != 5);
		sc.close();
	}

}
