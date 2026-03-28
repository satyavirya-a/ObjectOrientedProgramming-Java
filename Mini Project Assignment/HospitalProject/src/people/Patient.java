package people;

import java.util.ArrayList;

public class Patient {
	
	private int id;
	private String name;
	private int age;
	private ArrayList<String> medicalRecords;
	private int totalSpent;
	
	
	public Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		medicalRecords = new ArrayList<>();
		totalSpent = 0; 
	}
	
	public void printPatientInfo() {
		System.out.println("- " + name + "(ID: " + id + ", Age: "+ age + ")");
		System.out.println("  Medical Records:"); 
		for (String str : medicalRecords) {
			System.out.println(str);
		}
		
		System.out.println("    Total Spent: " + totalSpent);
		
	}
	
	public void addTotalSpent(int fee) {
		totalSpent += fee;
	}

	public void addMedicalRecord(String record) {
		medicalRecords.add(record);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(ArrayList<String> medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public int getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(int totalSpent) {
		this.totalSpent = totalSpent;
	}
	
	
	
	
}
