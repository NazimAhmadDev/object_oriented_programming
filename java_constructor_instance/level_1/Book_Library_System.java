package week2_Assignment2;

class Books{
	public int ISBN;
	protected String title;
	private String author;
	
	
	Books(int ISBN, String title, String author){
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}

	// get
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void display() {
		System.out.println("ISBN : "+ISBN);
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
	}
	
}

class Ebook extends Books {
	Ebook(int ISBN, String title, String author){
		super(ISBN, title, author);
	}
	
	public void display() {
		super.display();
		
	}

}


public class Book_Library_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Book object
		Books b1 = new Books(12354,"Three Men In A Boat","Unknown");
		b1.display();
		
		System.out.println();
		
		b1.setAuthor("George");
		//System.out.println("Author Name :"+b1.getAuthor());
		b1.display();
		
		
		System.out.println();
		
		
		// Creating Object of class Ebook
		Ebook eb1 = new Ebook(62354,"Gates Of Heaven","Unknown");
		eb1.display();
		
		System.out.println();
		
		eb1.setAuthor("Edward");
		//System.out.println("Author Name :"+eb1.getAuthor());
		
		
		eb1.display();

	}

}
