package week2_Assignment3;

import java.util.*;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void displayBookInfo() {
		System.out.println("Title : "+title+"\n"+"Author : "+author);
	}
}

class Library {
	private String name;
	private ArrayList<Book> books;
	
	Library(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}
	
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void displayLibraryBooks() {
		System.out.println("Library : "+name);
		if(books.isEmpty()) {
			System.out.println("No books is found in library");
		}else {
			for(Book book : books) {
				book.displayBookInfo();
			}
		}
	}
}


public class LibraryAndBooks {

	public static void main(String[] args) {
		
		Book book1 = new Book("The Alchemist", "Paulo Coelho");
		Book book2 = new Book("1984", "George Orwell");
		Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger");
		
		
		Library centralLibrary = new Library("Central Library");
		Library cityLibrary = new Library("City Library");
		
		
		centralLibrary.addBook(book1);
		centralLibrary.addBook(book2);
		cityLibrary.addBook(book3);
		
		System.out.println("Central Library Books -->");
		centralLibrary.displayLibraryBooks();
		
		System.out.println();
		
		
		System.out.println("City Library Books -->");
		cityLibrary.displayLibraryBooks();
		
		System.out.println();
		
		book1.displayBookInfo();
		
		System.out.println();
		
		book2.displayBookInfo();
		
		System.out.println();
		
		book3.displayBookInfo();
		

	}

}
