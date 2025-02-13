package week2_Assignment2;


class LibraryBook{
	String title;
	String author;
	double price;
	boolean isBookAvailable;
	
	
	LibraryBook(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
		this.isBookAvailable = true;
	}
	
	void borrowBook(boolean isBookAvailable) {
		if(isBookAvailable == true) {
			System.out.println("You can borrow "+title+" book.");
		}else{
			System.out.println(title+" book is not available.");
		}
	}
}


public class LibraryBookApp {

	public static void main(String[] args) {
		
		LibraryBook book1 = new LibraryBook("Atomic Habit","James Henry",450.32);
		book1.borrowBook(true);
		
	}

}
