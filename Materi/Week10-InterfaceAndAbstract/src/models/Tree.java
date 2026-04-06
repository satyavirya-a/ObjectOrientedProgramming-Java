package models;

import main.Prunable;

public class Tree extends Plant implements Prunable {
	
	int height;
	
	public Tree() {
		// TODO Auto-generated constructor stub
	}

	public Tree(String name, int height) {
		super(name);
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fertilizing() {
		// TODO Auto-generated method stub
		System.out.println("Fertilizing " + name + " Tree");
	}

	@Override
	public void pruning() {
		// TODO Auto-generated method stub
		System.out.println("Pruning " + name + " Tree");
	}


}
