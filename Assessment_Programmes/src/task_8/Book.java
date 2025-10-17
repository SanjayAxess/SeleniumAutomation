package task_8;

public class Book {
	
	    // Fields
	    String title;
	    String author;
	    double price;

	    // Default constructor
	    Book() {
	        title = "Maths";
	        author = "Ramanujar";
	        price = 100.50;
	    }

	    // Method to display book details
	    void displayDetails() {
	        System.out.println("Book Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Create an object using the default constructor
	        Book b1 = new Book();

	        // Display book details
	        b1.displayDetails();
	    }
	}
