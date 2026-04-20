package main;

public class Pair<T, E> {

	private T key; //T dan E jadi data type baru yang digunakan di class tersebut
	private E value; 
	
	public Pair(T key, E value) {
		this.key = key;
		this.value = value;
	}
	
	public void printData() {
		System.out.println(key + " " + value);
	}

}
