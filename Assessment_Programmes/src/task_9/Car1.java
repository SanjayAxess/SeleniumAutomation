package task_9;

class Car1 {
	    // Classes and objects
	    String make;
	    String model;
	    int year;

	    // Constructor to initialize the car object
	    Car1(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    // Method to display car details
	    void displayDetails() {
	        System.out.println("Car Make: " + make);
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Year: " + year);
	       
	    }

	    // Main method to create objects and test
	    public static void main(String[] args) {
	        // Creating car objects
	        Car1 car1 = new Car1("Toyota", "Corolla", 2020);
	        Car1 car2 = new Car1("Honda", "Civic", 2019);

	        // Displaying details of each car
	        car1.displayDetails();
	        car2.displayDetails();
	        
	    }}

