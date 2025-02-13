package week2_Assignment2;


class Circle {
	double radius;
	
	Circle(){
		this(12.2);
	}
	
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	void display() {
		System.out.println("Radius : "+radius);
		System.out.println("Area : "+getArea());
	}
}


public class Circle_Program {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.display();
		
		System.out.println();
		
		Circle c2 = new Circle(10.0);
		c2.display();
		
		
	}
}
