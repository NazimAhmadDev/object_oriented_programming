package week2_Assignment2;


class BookDetails{
	String title;
	String author;
	double price;
	
	BookDetails(){
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.0;
	}
	
	BookDetails(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	public void display() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
	}
}


public class Book {

	public static void main(String[] args) {
		
		BookDetails book1 = new BookDetails();
		book1.display();
		
		System.out.println();
		
		BookDetails book2 = new BookDetails("Solo Leveling","Sung JinWoo",450.34);
		book2.display();

	}

}
