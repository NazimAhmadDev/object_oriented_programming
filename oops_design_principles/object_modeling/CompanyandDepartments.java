package week2_Assignment3;

import java.util.*;

class Employee {
	String empName;
	String empPosition;
	
	Employee(String empName, String empPosition){
		this.empName = empName;
		this.empPosition = empPosition;
	}
	
	public void displayEmployee() {
		System.out.println("Employee Name : "+empName+"\n"+"Employee Position : "+empPosition);
	}
}

class Department {
	String deptName;
	List<Employee> employees;
	
	Department(String deptName) {
		this.deptName = deptName;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(String empName, String empPosition) {
		employees.add(new Employee(empName,empPosition));
	}
	
	public void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}



class Company {
	String companyName;
	List<Department> departments;
	
	Company(String companyName) {
		this.companyName = companyName;
		this.departments = new ArrayList<>();
	}
	
	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	public void displayCompany() {
		System.out.println("Company : "+companyName);
		for(Department d : departments) {
			d.displayDepartment();
		}
	}
}



public class CompanyAndDepartments {

	public static void main(String[] args) {
		
		Company myCompany = new Company("Capgemini");
		
		
		// Creating departments
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        
        // Adding employees to departments
        itDept.addEmployee("Alice", "Software Engineer");
        itDept.addEmployee("Bob", "DevOps Engineer");

        hrDept.addEmployee("Charlie", "HR Manager");
        hrDept.addEmployee("David", "Recruiter");

        
        // Adding departments to the company
        myCompany.addDepartment(itDept);
        myCompany.addDepartment(hrDept);

        
        
        // Display company structure
        myCompany.displayCompany();
	}

}
