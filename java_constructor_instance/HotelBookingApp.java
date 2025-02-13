package week2_Assignment2;

class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	
	
	HotelBooking(){
		this.guestName = "Unknown";
		this.roomType = "Unknown";
		this.nights = 0;
	}
	
	
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	HotelBooking(HotelBooking other){
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	
	void display() {
		System.out.println("GuestName : "+guestName);
		System.out.println("RoomType : "+roomType);
		System.out.println("Number of Nights : "+nights);
	}
}


public class HotelBookingApp {

	public static void main(String[] args) {
		
		HotelBooking b1 = new HotelBooking();
		b1.display();
		
		System.out.println();
		
		
		HotelBooking b2 = new HotelBooking("Hotel Raddison","3BHK",3);
		b2.display();
		
		
		System.out.println();
		
		
		HotelBooking b3 = new HotelBooking(b2);
		b3.display();

	}

}
