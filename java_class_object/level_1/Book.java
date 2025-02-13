package week2_Assignment1;
class BookDetails {
	String title;
	String author;
	double price;
	
	public void display() {
		System.out.println("BookTitle : "+title + "\n"+ "BookAuthor : "+author + "\n"+ "BookPrice : "+price);
	}
}
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDetails bd = new BookDetails();
		
		bd.title = "Atomic Habits";
		bd.author = "James Henry";
		bd.price = 500.56;
		
		bd.display();

	}

}
