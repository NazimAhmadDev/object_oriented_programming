package week2_Assignment1;
class MobilePhone{
	String brand;
	String model;
	double price;
	
	
	public void display() {
		System.out.println("Brand : "+brand+"\n"+"Model : "+model+"\n"+"Price : "+price);
	}
}
public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobilePhone obj = new MobilePhone();
		
		obj.brand = "Iphone";
		obj.model = "16 pro";
		obj.price = 125000;
		
		obj.display();
		
	}

}
