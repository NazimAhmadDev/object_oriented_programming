package Week2Assigment4;
import java.util.ArrayList;
import java.util.List;

class course {
    private String name;
    private Professor professor;
    private List<Student> students;

    public course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Assign a professor to this course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Enroll a student in this course
    public void enrollStudent(Student student) {
        students.add(student);
    }

    // Display course details and enrolled students
    public void displayCourseInfo() {
        System.out.println("Course: " + this.name);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not assigned yet"));
        System.out.println("Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }

    public String getName() {
        return this.name;
    }
}

// Class representing a Professor
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Assign a professor to teach a course
    public void assignToCourse(Course course) {
        course.assignProfessor(this);
    }

    // Display professor's details
    public void displayProfessorInfo() {
        System.out.println("Professor: " + this.name);
    }
}

// Class representing a Student
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    // Display student's courses
    public void displayStudentCourses() {
        System.out.println("Student: " + this.name);
        if (courses.isEmpty()) {
            System.out.println("Not enrolled in any courses.");
        } else {
            System.out.println("Enrolled in courses:");
            for (Course course : courses) {
                System.out.println(course.getName());
            }
        }
    }
}
public class UniversityManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");

        // Assign professors to courses
        professor1.assignToCourse(course1);
        professor2.assignToCourse(course2);

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Students enroll in courses
        student1.enrollInCourse(course1);
        student2.enrollInCourse(course1);
        student2.enrollInCourse(course2);

        // Display the university structure (students and their courses)
        student1.displayStudentCourses();
        student2.displayStudentCourses();

        // Display course details (professor and enrolled students)
        course1.displayCourseInfo();
        course2.displayCourseInfo();

	}

}
