package week2_Assignment3;

import java.util.*;

class UniversityCourse {
    private String courseName;
    private Professor professor;
    private List<UniversityStudent> students;

    UniversityCourse(String courseName) {
        this.setCourseName(courseName);
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(UniversityStudent student) {
        students.add(student);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + getCourseName());
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("No professor assigned.");
        }

        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            System.out.println("Enrolled Students:");
            for (UniversityStudent s : students) {
                System.out.println(" - " + s.getName());
            }
        }
        System.out.println("----------------------");
    }

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}

class Professor {
    private String name;

    Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class UniversityStudent {
    private String name;
    private List<UniversityCourse> courses;

    UniversityStudent(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(UniversityCourse course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void displayStudentCourses() {
        System.out.println("Student: " + name);
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("Enrolled Courses:");
            for (UniversityCourse c : courses) {
                System.out.println(" - " + c.getCourseName());
            }
        }
        System.out.println("----------------------");
    }
}

public class UniversityManagementSystem2 {
    public static void main(String[] args) {
        // Creating Professors
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");

        // Creating Courses
        UniversityCourse course1 = new UniversityCourse("Data Structures");
        UniversityCourse course2 = new UniversityCourse("Database Systems");

        // Assigning Professors to Courses
        course1.assignProfessor(prof1);
        course2.assignProfessor(prof2);

        // Creating Students
        UniversityStudent student1 = new UniversityStudent("Nazim Ahmad");
        UniversityStudent student2 = new UniversityStudent("Vansh Tripathi");

        // Enrolling Students in Courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display Course Info
        course1.displayCourseInfo();
        course2.displayCourseInfo();

        // Display Student Course Info
        student1.displayStudentCourses();
        student2.displayStudentCourses();
    }
}

