package mainWeek2;

import java.util.*;
import java.util.regex.Pattern;

public class mainWeek2 {
	
	//harus buat object dari class mainWeek2 buat akses atr
	int atr;
	
	//Static -> bisa diakses meski gak dibuat object 
	static int wkr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		mainWeek2 m = new mainWeek2();
		m.atr = 3;
		
		mainWeek2.wkr = 2;
		
		//tipe data primitive dan wrapper
		
		//wrapper class itu ada atribut dan method
		
		//tiap primitive data type punya wrapper class untuk buat object
		
		//wrapper class tidak bisa di otak atik karena udah final
		
		Integer x = 12; //mirip kaya yang biasa, tapi ini jadinya object
		Integer y = Integer.valueOf(15); //buat object pake primitve data
		
		
		//kalau CAPS LOCK itu static atribut
		
		
		//WRAPPER STRING
		String s1 = "Hello1";
		String s2  = new String ("Hello2");
		
		
		
		//PARSE
		Integer x2 = Integer.parseInt("20"); //biasanya buat parsing string argument jadi angka
		
		
		//TOSTRING
		String num = Integer.toString(15); //keballikan parse, ubah angka jadi string
		
		
		//METHOD METHOD STRING
		String name = " PPTI24 ";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		//trim buat apus trailing space (spasi di tengah bukan trailing space)
		System.out.println(name.trim());
		System.out.println(name.indexOf("P"));
		System.out.println(name.replace("PPTI", "PPBP"));
		
		
		
		
		//VALIDASI
			//do while : minimal 10 character
			//try catch: di suruh input angka, kalau bukan angka, suruh ulang
		
		try {
			
		}catch (Exception e) { //ini general aja
			
		}
//		catch (InputMismatchException e) {
//			
//		}catch (NumberFormatException e) {
//			
//		}
		
		//bisa buat langsung try catch dengan cara klik kanan trus surrounds with
//		try {
//			int a; 
//			a = sc.nextInt();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//bisa langsung gitu sama, pakai surrounds with
//		do {
//			int b;
//			b = sc.nextInt();
//		} while (condition);
		
		String nama;
		do {
			System.out.print("Name:");
			nama = sc.nextLine();
		} while (nama.length() < 5 || nama.length() > 20);
		
		
		//regex buat validasi formatting (gak masuk ujian)
		
		System.out.println(Pattern.matches("geeks[0-9]", "geeks10"));
		//output false
		
		
		
		//ARRAY
		//simpen data dengan tipe data yang sama
			//1D
		String[] nameList = new String[5]; //biar gak campur antara data type dan nama variablke aja
		
			//2D
		String[][] nameList2 = new String[5][5];
		
		nameList[0] = "Satya";
		
		System.out.println(nameList[0]);
		
		int[] arr = {1,2,3,4};
		System.out.println(arr.length); //length ini atribut tapi gak static
//		name.length() ini method
//		arr.length ini atribut
		
		//2D MATRIX
		int[][] matrix  = new int[2][3]; //assign size nya di sebelah kanan
		
		
		
		  
		sc.close();
		
	}

}
