package week2_Assignment2;


class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person(Person other) {
		this.name = other.name;
		this.age = other.age;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}


public class Person_Program {

	public static void main(String[] args) {
		
		Person p1 = new Person("Alex",21);
		p1.display();
		
		System.out.println();
		
		Person p2 = new Person(p1);
		p2.display();
		
	}

}
