package week2_Assignment1;
import java.util.*;

class CartItem{
	String itemName;
	int quantity;
	double price;
	
	CartItem(String itemName, int quantity, double price) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	
}


class ShoppingCart{
	private ArrayList<CartItem> cart;
	
	ShoppingCart(){
		cart = new ArrayList<>();
	}
	
	// add item
	public void addItem(String itemName, int quantity, double price) {
		cart.add(new CartItem(itemName, quantity, price));
		System.out.println(quantity + " " + itemName+ " is added to the cart.");
		System.out.println();
	}
	
	
	// remove item
	public void removeItem(String itemName) {
		for(int i=0;i<cart.size();i++) {
			if(cart.get(i).itemName.equalsIgnoreCase(itemName)) {
				cart.remove(i);
				System.out.println("Item removed from cart.");
				System.out.println();
			}return;
		}
		System.out.println("Item not found in the cart");
		System.out.println();
	}
	
	
	// Total cost
	public void displayTotalCost() {
		double totalCost = 0;
		
		for(CartItem item : cart) {
			totalCost += item.price * item.quantity;
		}
		
		System.out.println("TotalCost : ₹"+totalCost);
		System.out.println();
	}
	
	// Display cart
	public void displayCart() {
		if(cart.isEmpty()) {
			System.out.println("Cart is empty.");
			System.out.println();
			return;
		}
		System.out.println("Shopping Cart ->");
		for(CartItem item : cart) {
			System.out.print(item.itemName + " - ₹" + item.price + " x " + item.quantity+ " : "+item.price * item.quantity+"\n");
		}
		System.out.println();
	}
	
}

public class ShoppingCartApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem("Chips",2, 10.00);
		cart.addItem("Bourbon",10, 50.00);
		cart.addItem("Tshirt",2, 250.00);
		cart.addItem("NoteBook",1, 20.00);
		
		
		cart.displayCart();
		
		
		cart.displayTotalCost();
		
	}

}
