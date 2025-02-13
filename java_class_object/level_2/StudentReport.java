package week2_Assignment1;
class Student{
	String name;
	int rollNumber;
	int marks;
	
	Student(String name, int rollNumber, int marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	String grade = "";
	
	public void calculateGrade() {
		if(marks < 40) {
			grade = "F";
			System.out.println("Your Grade : "+grade);
		}
		if(marks >= 40 && marks <=50) {
			grade = "P";
			System.out.println("Your Grade : "+grade);
		}
		if(marks >= 51 && marks <= 60) {
			grade = "D";
			System.out.println("Your Grade : "+grade);
		}
		if(marks >= 61 && marks <= 70) {
			grade = "C";
			System.out.println("Your Grade : "+grade);
		}
		if(marks >= 71 && marks <= 80) {
			grade = "B";
			System.out.println("Your Grade : "+grade);
		}
		if(marks >= 81 && marks <= 90) {
			grade = "A";
			System.out.println("Your Grade : "+grade);
		}
		if(marks >= 91 && marks <= 100) {
			grade = "Outstanding";
			System.out.println("Your Grade : "+grade);
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	
	
	public void displayDetails() {
		System.out.println();
		System.out.println("STUDENT DETAILS ->");
		System.out.println("Name : "+name+"\n"+"RollNumber : "+rollNumber+"\n"+"Marks : "+marks+"\n"+"Grade : "+grade);
	}
	
	
}
public class StudentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student("Nazim Ahmad",2110990935,100);
		
		st.calculateGrade();
		st.displayDetails();
	}

}
