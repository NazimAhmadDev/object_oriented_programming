package week2_Assignment1;
import java.util.*;

class Item{
	int itemCode;
	String itemName;
	double price;
	
	Item(int itemCode, String itemName, double price) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	
	public void display(int quantity) {
		System.out.println("ItemCode : "+itemCode+"\n"+"ItemName : "+itemName+"\n"+"Price : "+price+"\n"+"TotalCost : "+quantity*price);
		
	}
}
public class Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter quantity of item : ");
		int quantity = sc.nextInt();
		
		Item obj = new Item(1,"Chips",20.00);
		
		obj.display(quantity);
		
		sc.close();
	}

}
