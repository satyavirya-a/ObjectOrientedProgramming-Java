package hospital;

import java.util.ArrayList;

import main.Main;
import people.Doctor;
import people.Patient;


public class Hospital {
	
	private String name;
	private ArrayList<Department> departments;
	private ArrayList<Patient> patients;
	private int HospitalIncome;
	
	public Hospital(String name) {
		this.name = name;
		departments = new ArrayList<>();
		patients = new ArrayList<>();
		HospitalIncome = 0;
	}
	


	public void addDepartment(Department d) {
		departments.add(d);
	}
	
	public void registerPatient(Patient p) {
		patients.add(p);
	}
	
	public void processVisit(Patient p, Doctor d, String visitDetails) {
		p.addMedicalRecord("Visited " + "Dr. " + d.getName() + " for " + visitDetails + "(Cost: " + Main.formatIDR(d.getFee())  + ")");
		d.processVisit(p, visitDetails);
		HospitalIncome += d.getFee();
		
		
	}
	
	public void displayHospitalInfo() {
		System.out.println("Hospital: " + name);
		System.out.println();
		System.out.println("Departments:");
		
		for (Department department : departments) {
			department.printDepartementInfo();
		}
		
		
		System.out.println("Doctors: "); 
		for (Department department : departments) {
			department.printDoctor();
		}
		System.out.println();
		
		System.out.println("Patients: ");
		for (Patient pat : patients) {
			pat.printPatientInfo();
			System.out.println();
		}
		
		System.out.println("Total Hospital Income: " + Main.formatIDR(HospitalIncome));
		
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ArrayList<Department> getDepartments() {
		return departments;
	}



	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}



	public ArrayList<Patient> getPatients() {
		return patients;
	}



	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	
}
