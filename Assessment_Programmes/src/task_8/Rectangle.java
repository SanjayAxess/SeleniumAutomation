package task_8;

class Rectangle {

	    double length;
	    double width;

	    // Default constructor
	    Rectangle() {
	        length = 1;
	        width = 1;
	    }

	    // Parameterized constructor
	    Rectangle(double l, double w) {
	        length = l;
	        width = w;
	    }

	    // Method to calculate area
	    double calculateArea() {
	        return length * width;
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        // Object using default constructor
	    	Rectangle rect1 = new Rectangle();
	        System.out.println("Area of Rectangle (default constructor): " + rect1.calculateArea());

	        // Object using parameterized constructor
	        Rectangle rect2 = new Rectangle(5.5, 3.2);
	        System.out.println("Area of Rectangle (parameterized constructor): " + rect2.calculateArea());
	    }
	}
