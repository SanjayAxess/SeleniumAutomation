package task_9;

	// Base class
	class Person {
	    String name;
	    int age;

	    // Constructor to initialize Person properties
	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display Person info
	    void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	// Subclass inheriting Person
	class Employee extends Person {
	    int employeeId;

	    // Constructor to initialize Employee properties (including base class properties)
	    Employee(String name, int age, int employeeId) {
	        super(name, age); // Call the constructor of Person
	        this.employeeId = employeeId;
	    }

	    // Method to display Employee info
	    void displayEmployeeInfo() {
	        displayInfo(); // Call base class method
	        System.out.println("Employee ID: " + employeeId);
	    }
	}

	// Main class to test
	public class Person_Singleinheritance {
	    public static void main(String[] args) {
	        Employee emp = new Employee("Sheeja", 23, 101);
	        emp.displayEmployeeInfo();
	    }
	}

