package Inheritance_Task;

//Exercise:4  Book Hierarchy
//Create a Java class hierarchy for different types of books: Book, FictionBook, and NonFictionBook.

//Book Class:
//Properties: title, author, year
//Method: displayInfo(), which prints the book's title, author, and year of publication.

//FictionBook Class (subclass of Book):
//Additional Property: genre
//Method: read(), which prints "Enjoy reading this fiction book."

//NonFictionBook Class (subclass of Book):
//Additional Property: topic
//Method: study(), which prints "Use this non-fiction book for studying."

//Write a Main class to demonstrate the use of these classes by creating instances of both
//FictionBook and NonFictionBook, setting their properties, and calling their methods.

class Book {

	String title;
	String author;
	int year;

	public Book(String title, String author, int year) {

		this.title = title;
		this.author = author;
		this.year = year;
		this.displayInfo();
	}

	public void displayInfo() {

		System.out.println("Title of the book is : " + title);
		System.out.println("The author name is : " + author);
		System.out.println("The year of puublished in : " + year);
	}

}

class FictionBook extends Book {
	
	String genre;

	public FictionBook(String title, String author, int year, String genre) {

		super(title, author, year);
		this.genre = genre;
	}

	public void read() {

		System.out.println("Enjoy reading this fiction book .");
	}

}

class NonFictionBook extends Book{
	
	String topic;

	public NonFictionBook(String title, String author, int year,String topic) {
		
		super(title,author,year);
		this.topic = topic;

	}
	
	public void study() {
		
		System.out.println("Use this non-fiction book for study .");
	}

}

public class BookHierarchy {

	public static void main(String[] args) {
		
		FictionBook FB = new FictionBook("Harry Potter","J.K.Rowling",1995,"Mystery");
		FB.read();
		
		System.out.println("---------------------------------------------");
		
		NonFictionBook NFB = new NonFictionBook("Rich dad poor dad","Robert T. Kiyosaki",1997,"Importance of financial literacy");
		NFB.study();

	}

}

//Output:

//Title of the book is : Harry Potter
//The author name is : J.K.Rowling
//The year of puublished in : 1995
//Enjoy reading this fiction book .
//---------------------------------------------
//Title of the book is : Rich dad poor dad
//The author name is : Robert T. Kiyosaki
//The year of puublished in : 1997
//Use this non-fiction book for study .

