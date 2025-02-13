package week2_Assignment1;
class EmployeeDetails {
	String name;
	int id;
	double salary;
	
	
	EmployeeDetails(String name,int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("EmployeeName : "+name + "\n"+"EmployeeID : "+id+"\n"+"EmployeeSalary : "+salary);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetails emp = new EmployeeDetails("Nazim",2110990935,5000000);
		
		emp.display();

	}

}
