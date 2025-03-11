package week2_Assignment3;

import java.util.*;


class Patient {
	private String name;
	
	Patient(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void displayPatient() {
		System.out.println("Patient name : "+name);
	}
}

class Doctor {
	String doctorName;
	List<Patient> patients;
	
	Doctor(String doctorName){
		this.doctorName = doctorName;
		this.patients = new ArrayList<>();
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	public void displayDoctor() {
		System.out.println("Doctor : "+doctorName);
		for(Patient p : patients) {
			p.displayPatient();
		}
	}
}

class Hospital {
	String hospitalName;
	List<Doctor> doctors;
	
	Hospital(String hospitalName){
		this.hospitalName = hospitalName;
		this.doctors = new ArrayList<>();
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	public void displayHosptial() {
		System.out.println("Hospital : "+hospitalName);
		for(Doctor d : doctors) {
			d.displayDoctor();
		}
	}
}

public class HospitalManagementSystem {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital("Command Hospital");
		
		Patient p1 = new Patient("Aman");
		Patient p2 = new Patient("Mehar");
		
		Doctor d1 = new Doctor("Richa");
		Doctor d2 = new Doctor("Naznee");
		
		d1.addPatient(p1);
		d2.addPatient(p2);
		
		
		hospital.addDoctor(d1);
		hospital.addDoctor(d2);
		
		
		hospital.displayHosptial();

	}

}
