
import java.util.*; //langsung input semua library


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive data type
		//int long short byte, char, float, double
		int age = 21;
		age = 10;
		
		//Wrapper class
		//string
		String Kelas = "PPTI24";
		Kelas = "Hello PPTI24" + " Week1";
		
//		String json = ""{
//				"name":"Jason"
//		}"";
		
		
		
		char c = 'A';
		
		//output
		System.out.println("Age: "+age + c); //print dengan new line
		System.out.print("Name: " + Kelas + "\n"); //print tanpa pakai  new line
		System.out.printf("Age: %d, Name: %s\n", age, Kelas);
		
		String name = "Jason"; //upper class (kalau mau operasi tinggal pake dot
		//strcmp
		if (name.equals("Budi")) {
			System.out.println("Ini jason");
		}
		else {
			System.out.println("Bukan");
		}
		
		
		
		//input
		//1. buat object scanner dan import library
		Scanner scan = new Scanner(System.in);  //ini kaya fopen
		
		
		//2. input pakai method scanner
		System.out.print("Input nama: ");
		String Text = scan.nextLine(); // scan bisa menyesuaian nama object yang dibuat scan atau sc
		System.out.print("Input usia: ");
		age = scan.nextInt();
		scan.nextLine(); //ini getchar()
		
		
		
		System.out.println("Nama:" + Text);
		System.out.println("Umur:" + age);
		
		
		
		
		
		//looping masih sama
		//case nya bisa return value
		
		
		//MATH
		//class math udah ada langsung kaga harus import class
		System.out.println(Math.floor(3.76));
		//ada fugnsi rint (pembulatan ke genap terdekat
		
		//RANDOM
		//dia bakal return angka dari 0000 sampai 0.999999
		System.out.println(Math.random());
		System.out.println(Math.floor(Math.random()*10));
		
		//atau pake class random yang ada di library random (Harus di import karena ada di java.util)
		Random rand = new Random(); //ini buat object nya
		System.out.println(rand.nextInt(50)); //buat random dari nol sampai 50
		
		
		//harus dibuat object karena gak ada static
		//kalau ada static bisa langsung di panggil
		
		
		
		//buat validasi biar gak langsung error (EXCEPTION HANDLING)
		int angka = 0;
		try {
			System.out.print("Input Angka: ");
			angka = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("Input harus angka");
			scan.nextLine(); //haru ada yang nangkep kalimat ketika input salah
			angka = 0;
		}
		
		
		
//		buat menu
		
//		do {
//			System.out.println("1. Menu1");
//			System.out.println("2. Menu2");
//			System.out.println("3. Exit");
//			
//		} while ()
		
		
		
		
		
		
		scan.close(); //ini kaya fclose
		
		
	}

}


