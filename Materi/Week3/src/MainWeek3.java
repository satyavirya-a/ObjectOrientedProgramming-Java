
//Arrray List
//Dinamis & akses pakai Index

import java.util.ArrayList; //buat pake arraylist
import java.util.Comparator;

public class MainWeek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sifat data type homogen, sama semua
		//harus pake data type Wrapper (gak boleh primitive)
		ArrayList<String>  cities = new ArrayList<>(); //harus pake new kalau yang baru
		
		//INSERT--> add
		//bisa masukin array list juga selama bisa dibuat object
		cities.add("Ayam");//ketambahnya ururt
		cities.add("Ikan");
		cities.add("Jakarta");
		
		//insert tengah tengah
		cities.add(1, "Serang"); //sisanya geser ke kanan
		
		//VIEW
		

		//OPSI 1
			//SORTING
		System.out.println("Before " + cities);
		System.out.println();
		
		cities.sort(null);
		System.out.println("After (Ascending) " + cities);
		
		cities.sort(Comparator.reverseOrder());
		System.out.println("After (Descending) " + cities);
		
		// comparing dari panjang length string
		//buat dulu object comparator baru
		Comparator<String> cmp = Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
		cities.sort(cmp);
		System.out.println(cities);
		
		
		//OPSI 2
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		System.out.println();
		
		//OPSI 3
		//buat variabel iterasi c
		for (String c : cities) {
			System.out.println(c);
		}
		System.out.println();
		
		//DELETE -> remove
//		cities.remove(1); 
//		System.out.println(cities);
		
		//dia bisa return data yang di remove
		String removed = cities.remove(2);
		System.out.println(cities);
		System.out.println(removed + " is Removed");
		
		//UPDATE --> set
		cities.set(0, "Tangerang");
		System.out.println(cities);
		
		//OTHERS
		//cek apakah data ada
		System.out.println(cities.contains("Sentul")); //biasanya cuma untuk data biasa kaga bisa object buat sendiri
		
		//kalau cek apakah kosong
		System.out.println(cities.isEmpty());
		
		//hapus semua
		cities.clear();
		
		
		
		ArrayList<Item> grocery = new ArrayList<>();
		grocery.add(new Item("Sabun", 10000, 10));
		for (Item i : grocery) {
			System.out.println(i.name);
			System.out.println(i.price);
			System.out.println(i.qty);
		}
	}

}
