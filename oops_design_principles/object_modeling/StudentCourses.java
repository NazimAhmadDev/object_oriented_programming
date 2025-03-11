package week2_Assignment3;
import java.util.*;

class Course {
	private String courseName;
	private List<Student> enrolledStudents;
	
	Course(String courseName) {
		this.courseName = courseName;
		this.enrolledStudents = new ArrayList<>();
	}
	
	public String getCourse() {
		return courseName;
	}
	
	
	public void enrolledStudents(Student student) {
		enrolledStudents.add(student);
	}
	
	
	public void displayDisplay() {
		System.out.println("Enrolled Course : "+courseName);
		for(Student s : enrolledStudents) {
			System.out.println(s.getstudentName());
		}
	}
	
}




class Student{ 
	private String studentName;
	private List<Course> courses;
	
	Student(String studentName) {
		this.studentName = studentName;
		this.courses = new ArrayList<>();
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public void getCourse(Course courses) {
		
	}
	
	public void displayEnrolledCourses() {
		System.out.println("Student : "+studentName);
		for(Course c : courses) {
			System.out.println(c.getCourse());
		}
	}
	
}




class School {
	String schoolName;
	List<Student> students;
	
	School(String schoolName){
		this.schoolName = schoolName;
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	
	public void displayStudents() {
		System.out.println("School : "+schoolName);
		for(Student s : students) {
			System.out.println("Student : "+s.getstudentName());
		}
	}
	
}

public class StudentCourses {

	public static void main(String[] args) {
		
		School mySchool = new School("Kendriya Vidyalaya");
		
		Student Nazim = new Student("Nazim Ahmad");
		Student Manish = new Student("Manish Kumar");
		
		Course Math = new Course("Mathematics");
		Course Science = new Course("Science");
		
		
		mySchool.displayStudents();
		
		Nazim.displayEnrolledCourses();
		Manish.displayEnrolledCourses();
		
	}

}
