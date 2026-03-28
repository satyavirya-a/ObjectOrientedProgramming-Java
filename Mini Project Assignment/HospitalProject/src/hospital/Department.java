package hospital;

import java.util.ArrayList;

import people.Doctor;

public class Department {
	private String name;
	private Doctor headDoctor;
	private ArrayList<Doctor> doctors;
	
	public Department(String name) {
		this.name = name;
		doctors = new ArrayList<>();
		headDoctor = null;
	}
	
	public void printDepartementInfo() {
		System.out.println("- " + name + "(Head Doctor: " + headDoctor.getName() +")");
	}
	
	public void printDoctor() {

		for (Doctor doc : doctors) {
			doc.printDoctorInfo();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Doctor getHeadDoctor() {
		return headDoctor;
	}

	public void setHeadDoctor(Doctor headDoctor) {
		this.headDoctor = headDoctor;
		doctors.add(headDoctor);
		
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	
	
	
}
