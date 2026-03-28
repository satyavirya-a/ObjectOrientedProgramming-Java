package models;

import java.util.ArrayList;

public class Airport {
	private String name;
	private int totalPandapatan;
	private ArrayList<Flight> flights;
	
	public Airport(String name, int totalPenerbangan) {
		this.name = name;
		this.totalPandapatan = totalPenerbangan;
		flights = new ArrayList<>();
	}
	
	
	public void addFlight(Flight f) {
		flights.add(f);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTotalPenerbangan() {
		return totalPandapatan;
	}


	public void setTotalPenerbangan(int totalPenerbangan) {
		this.totalPandapatan = totalPenerbangan;
	}


	public ArrayList<Flight> getFlights() {
		return flights;
	}


	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	
	
	
}
