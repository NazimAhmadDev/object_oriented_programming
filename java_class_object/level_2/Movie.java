package week2_Assignment1;
class MovieTicket{
	String movieName;
	String seatNumber;
	double price;
	
	MovieTicket(String movieName, String seatNumber, double price){
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	
	public void bookSeat() {
		if(seatNumber == "" && price == 0) {
			System.out.println("Not Booked");
		}else {
			System.out.println("Seat Booked!!!");
		}
	}
	
	
	public void ticketDetails() {
		System.out.println();
		System.out.println("TICKET DETAILS ->");
		System.out.println("MovieName : "+movieName+"\n"+"SeatNumber : "+seatNumber+"\n"+"Price : "+price);
	}
}
public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieTicket obj = new MovieTicket("Avengers Secret Wars","",0);
		
		obj.bookSeat();
		
		obj.ticketDetails();

	}

}
