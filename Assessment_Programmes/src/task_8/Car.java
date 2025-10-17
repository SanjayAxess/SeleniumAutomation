package task_8;

public class Car {

	    // Fields
	    String make;
	    String model;
	    int year;

	    // Default constructor
	    Car() {
	        make = "Renault";
	        model = "RMZ";
	        year = 2021;
	    }

	    // Method to display details
	    void displayDetails() {
	        System.out.println("Car Make: " + make);
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Year: " + year);
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Create object using default constructor
	        Car myCar = new Car();

	        // Display details
	        myCar.displayDetails();
	    }
	}

