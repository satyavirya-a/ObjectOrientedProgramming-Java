package hashset;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> numbers = new HashSet<>();
		//dia buat hash nya dulu (unique)
		//pas insert, cek dulu ( bandingin semua) apakah ada yang smaa
		//kalau ada yang sama ya gak usah ditambah lagi (tidak tambah memory)
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		
		for (Integer n : numbers) {
			System.out.println(n);
		}
		
		
		
	}

}
