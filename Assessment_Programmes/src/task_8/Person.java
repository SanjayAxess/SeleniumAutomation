package task_8;

class Person {
	    // Fields
	    String name;
	    int age;

	    // Default constructor
	    Person() {
	        name = "Akash";
	        age = 23;
	    }

	    // Parameterized constructor
	    Person(String n, int a) {
	        name = n;
	        age = a;
	    }

	    // Method to display details
	    void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println();
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Object using default constructor
	        Person p1 = new Person();
	        System.out.println("Details of Person 1:");
	        p1.displayDetails();

	        // Object using parameterized constructor
	        Person p2 = new Person("Alice", 25);
	        System.out.println("Details of Person 2:");
	        p2.displayDetails();
	    }
	}

