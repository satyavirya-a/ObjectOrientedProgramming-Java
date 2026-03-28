package people;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Doctor {
	
	private int id;
	private String name;
	private String specialty;
	private int fee;
	private ArrayList<Patient> patients;
	
	public Doctor(int id, String name, String specialty, int fee) {
		this.id = id;
		this.name = name;
		this.specialty = specialty;
		this.fee = fee;
		patients = new ArrayList<>();
	}
	
	
	public void addPatient(Patient p) {
		patients.add(p); 
	}
	
	
	public void processVisit(Patient p, String visitDetails) {
		p.addTotalSpent(fee);
	}
	
	public void printDoctorInfo() {
		System.out.println("- " + name + "(Speciality: " + specialty + ", Fee: " + fee);
		
		System.out.println("Patients:");
		printPatients();
	}

	public void printPatients() {
		for (Patient patient : patients) {
			System.out.println("    - " + patient.getName() + " (Age: " + patient.getAge() + ")");
		}
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


	public String getSpecialty() {
		return specialty;
	}


	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


	public ArrayList<Patient> getPatients() {
		return patients;
	}


	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	
	
	
}
