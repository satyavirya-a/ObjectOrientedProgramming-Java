package models;

import main.Prunable;
import main.Waterable;

public class Houseplant extends Plant implements Waterable, Prunable {
	
	int growth_time;
	
	public Houseplant() {
		// TODO Auto-generated constructor stub
	}

	public Houseplant(String name, int growth_time) {
		super(name);
		this.growth_time = growth_time;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fertilizing() {
		// TODO Auto-generated method stub
		System.out.println("Fertilizing " + name + " Houseplant");
	}

	@Override
	public void pruning() {
		// TODO Auto-generated method stub
		System.out.println("Pruning " + name + " Houseplant");
	}

	@Override
	public void watering() {
		// TODO Auto-generated method stub
		System.out.println("Watering " + name + " Houseplant");
	}

}
