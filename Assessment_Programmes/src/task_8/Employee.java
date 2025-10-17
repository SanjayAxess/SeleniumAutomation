package task_8;

class Employee {
	    // Fields
	    String name;
	    String position;
	    double salary;

	    // Parameterized constructor
	    Employee(String name, String position, double salary) {
	        this.name = name;
	        this.position = position;
	        this.salary = salary;
	    }

	    // Method to display employee details
	    void displayDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Position: " + position);
	        System.out.println("Salary: " + salary);
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Creating an object using the parameterized constructor
	        Employee emp1 = new Employee("John Doe", "Software Engineer", 75000.0);

	        // Calling the displayDetails method
	        emp1.displayDetails();
	    }
	}
