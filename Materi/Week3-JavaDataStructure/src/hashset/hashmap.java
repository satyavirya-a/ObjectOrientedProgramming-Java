package hashset;

import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ada key , ada value
		//key tidak boleh sama, jadi data unique
		//mirip dictionary
		
		//akses by key, tidak pakai index
			//harus berurutan key , value
		HashMap<Integer, String> students = new HashMap<>();
		
		students.put(123, "Satya");
		students.put(123, "Nitrogen"); //timpa data 
		students.put(143, "Ayam");
		
		System.out.println(students.get(123));
		System.out.println(students.keySet()); //return set of key
		
		for( String s : students.values()) { //return set of values
			System.out.println(s);
		}
		System.out.println();
		
		//ATAU
		for (Integer i: students.keySet()) {
			System.out.println(i);
		}
		System.out.println();
		
		

	}

}
