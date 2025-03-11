package week2_Assignment3;

import java.util.*;

class Faculty {
	private String name;
	
	
	Faculty(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void displayFaculty() {
		System.out.println("Faculty : "+name);
	}
}


class UniversityDepartment {
	String departmentName;
	List<Faculty> faculties;
	
	UniversityDepartment(String departmentName) {
		this.departmentName = departmentName;
		this.faculties = new ArrayList<>();
	}
	
	public void addFaculty(Faculty faculty) {
		faculties.add(faculty);
	}
	
	public void displayDepartment() {
		System.out.println("Department : "+departmentName);
		for(Faculty f : faculties) {
			f.displayFaculty();
		}
	}
	
	public List<Faculty> getFaculties() {
		return faculties;
	}
}


class University {
	String universityName;
	List<UniversityDepartment> departments;
	
	University(String universityName){
		this.universityName = universityName;
		this.departments = new ArrayList<>();
	}
	
	public void addDepartment(UniversityDepartment department) {
		departments.add(department);
	}
	
	
	public void displayUniversity() {
		System.out.println("University : "+universityName);
		for(UniversityDepartment d : departments) {
			d.displayDepartment();
		}
	}
}


public class UniversityManagementSystem {

	public static void main(String[] args) {
		
		University myUni = new University("Chitkara University");
		
		// Creating department
		UniversityDepartment cseDept = new UniversityDepartment("Computer Science");
		UniversityDepartment bbaDept = new UniversityDepartment("BBA");
		UniversityDepartment mDept = new UniversityDepartment("Mechanical Engineering");
		
		
		// Adding faculty
		Faculty f1 = new Faculty("Nazim Ahmad");
		Faculty f2 = new Faculty("Vansh Tripathi");
		Faculty f3 = new Faculty("Akshat Sharma");
		
		
		cseDept.addFaculty(f1);
		bbaDept.addFaculty(f2);
		mDept.addFaculty(f3);
		
		
		// Adding department
		myUni.addDepartment(cseDept);
		myUni.addDepartment(bbaDept);
		myUni.addDepartment(mDept);
		
		
		// displaying university
		myUni.displayUniversity();
		
	}

}
