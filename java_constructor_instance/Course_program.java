package week2_Assignment2;


class Course {
	String courseName;
	int duration;
	long fees;
	static String instituteName;
	
	Course(String courseName, int duration, long fees){
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
		instituteName = "Wipro";
	}
	
	void displayCourseDetails() {
		System.out.println("Institute Name : "+instituteName);
		System.out.println("Course Name : "+courseName);
		System.out.println("Duration of course (in Months): "+duration);
		System.out.println("Course fees : ₹"+fees);
	}
	
	
	static void updateInstituteName(String instituteNewName) {
		instituteName = instituteNewName;
	}
}


public class Course_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course c1 = new Course("Java Backend",4,2000);
		Course c2 = new Course("Data Engineering",6,1000);
		
		c1.displayCourseDetails();
		System.out.println();
		
		Course.updateInstituteName("Capgemini");
		System.out.println();
		
		c1.displayCourseDetails();
		
		
		System.out.println();
		
		
		c2.displayCourseDetails();
		
	}

}
