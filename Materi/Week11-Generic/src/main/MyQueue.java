package main;

import java.util.ArrayList;

//kita bikin class untuk array list !!
public class MyQueue<DataType> {

	private ArrayList<DataType> q;
	public MyQueue() {
		q = new ArrayList<DataType>();
	}
	
	public void enqueue(DataType d) {
		q.add(d);
	}
	
	public DataType dequeue() {
		return q.remove(0);
	}
	
	public DataType peek() {
		return q.get(0);
	}

}
