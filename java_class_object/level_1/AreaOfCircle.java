package week2_Assignment1;
import java.util.*;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius : ");
		int r = sc.nextInt();
		
		double AreaOfCircle = 3.14 * r * 2;
		
		System.out.print("Area Of circle : "+ AreaOfCircle);
		
		sc.close();

	}

}
