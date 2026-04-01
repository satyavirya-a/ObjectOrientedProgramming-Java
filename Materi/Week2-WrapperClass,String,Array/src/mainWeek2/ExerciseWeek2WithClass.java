package mainWeek2;

import java.util.*;
import java.util.ArrayList;

//class that have attribut nama dan email
class Orang {
	String name;
	String email;
	
	public Orang(String nama, String email) { //constructor (Name is name with class)
		//special method to initialize object using parameter
		this.name = nama;
		this.email = email; //this mean this class atribut
	}
	
}

class Manager {
	//class controller yang punya kuasa untuk menjalankan method method di main
	
	//buat dulu array list datanya
	ArrayList<Orang> orang = new ArrayList<>();
	
//	buat fungsi insert
	public void insert(Scanner sc) {
		//buat variabel buat simpen inputan
		String line;
		
		//buat menu untuk insert
		do {
			System.out.print("Masukan Nama;Email: ");
			line = sc.nextLine();
			if (!(line.contains("@"))) {
				System.out.println("Kaga ada @nya");
				continue;
			}
			else {
				String[] temp = line.split(";");
				orang.add(new Orang(temp[0], temp[1])); //tambahin ke arraylist new object pake constructor
				System.out.println("Data saved!");
			}
			
			sc.nextLine();
		} while (!(line.contains("@")));
	}
	
	public void view() {
		if (orang.isEmpty()) {
			System.out.println("List Empty");
		}
		
		else {
			//cari string terpanjang
			String max = "";
			int count = 1;
			for (Orang o : orang) {
				System.out.println(count + ". Nama: " + o.name + "| Email: " + o.email);
				if (o.name.length() > max.length()) {
					max = o.name;
				}
				count++;
			}
			
			System.out.println("Total Orang: " + orang.size());
			System.out.println("Nama terpanjang: " + max + " (" + max.length() + ")");
		}
	}
	
	
}



public class ExerciseWeek2WithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager1 = new Manager();
		Scanner sc = new Scanner(System.in);
		int opt;
		do {
			System.out.println("1. Insert");
			System.out.println("2. View");
			System.out.println("3. Exit");
			opt = sc.nextInt();
			sc.nextLine();
			
			switch (opt) {
			case 1: manager1.insert(sc);
				break;
			case 2: manager1.view();
				break;
			case 3: 
				break;
			default:
				System.out.println("Salah");			
			}
			
		} while (opt != 3);
		
		sc.close();

	}

}
