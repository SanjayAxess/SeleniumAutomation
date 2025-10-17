package task_8;

class Student_Parameterizedcons {

	    // Fields
	    String name;
	    int rollNumber;
	    char grade;

	    // Parameterized Constructor
	    Student_Parameterizedcons(String name, int rollNumber, char grade) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	    }

	    // Method to display student details
	    void displayDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Grade: " + grade);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        // Create object using parameterized constructor
	    	Student_Parameterizedcons s1 = new Student_Parameterizedcons("Aarav", 101, 'A');
	        
	        // Call displayDetails method
	        s1.displayDetails();
	    }
	}


