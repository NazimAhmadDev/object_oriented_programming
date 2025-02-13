package week2_Assignment2;

class CarRental{
	String customerName;
	String carModel;
	int rentalDays;
	
	
	CarRental(String customerName, String carModel, int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	void TotalCost() {
		double rentalCost = 5000;
		double grandTotal = rentalCost * rentalDays;
		System.out.println("TotalCost for renting "+carModel+" for "+rentalDays+" days : ₹"+grandTotal);
	}
}


public class CarRentalApp {

	public static void main(String[] args) {
		
		CarRental car1 = new CarRental("Nazim Ahmad","Hyundai i20",4);
		car1.TotalCost();

	}

}
