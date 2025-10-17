package task_1;

public class Variables_Dtypes {

	public static void main(String[] args) {
		
		        // 1. Declare Variables
		        int age = 20;
		        double height = 5.9;
		        char grade = 'A';
		        boolean isStudent = true;
		        System.out.println("1. Variable Declaration:");
		        System.out.println("Age: " + age);
		        System.out.println("Height: " + height);
		        System.out.println("Grade: " + grade);
		        System.out.println("Is Student: " + isStudent);
		        System.out.println("--------------------------------");

		        // 2. Swap Two Numbers
		        int a = 5, b = 10, temp;
		        temp = a;
		        a = b;
		        b = temp;
		        System.out.println("2. Swap Two Numbers:");
		        System.out.println("a = " + a + ", b = " + b);
		        System.out.println("--------------------------------");

		        // 3. Circle Area
		        double radius = 7.0;
		        double circleArea = 3.14159 * radius * radius;
		        System.out.println("3. Area of Circle = " + circleArea);
		        System.out.println("--------------------------------");

		        // 4. Simple Interest
		        double principal = 1000, rate = 5, time = 2;
		        double simpleInterest = (principal * rate * time) / 100;
		        System.out.println("4. Simple Interest = " + simpleInterest);
		        System.out.println("--------------------------------");

		        // 5. Temperature Conversion
		        double celsius = 37;
		        double fahrenheit = (celsius * 9 / 5) + 32;
		        System.out.println("5. Temperature in Fahrenheit = " + fahrenheit);
		        System.out.println("--------------------------------");

		        // 6. Sum of Two Numbers
		        int num1 = 8, num2 = 12;
		        int sum = num1 + num2;
		        System.out.println("6. Sum of Two Numbers = " + sum);
		        System.out.println("--------------------------------");

		        // 7. Product of Two Numbers
		        float num3 = 2.5f, num4 = 4.0f;
		        float product = num3 * num4;
		        System.out.println("7. Product of Two Numbers = " + product);
		        System.out.println("--------------------------------");

		        // 8. Rectangle Area
		        double length = 10, width = 5;
		        double rectangleArea = length * width;
		        System.out.println("8. Area of Rectangle = " + rectangleArea);
		        System.out.println("--------------------------------");

		        // 9. Square Perimeter
		        double side = 6;
		        double squarePerimeter = 4 * side;
		        System.out.println("9. Perimeter of Square = " + squarePerimeter);
		        System.out.println("--------------------------------");

		        // 10. BMI Calculator
		        double weight = 60;  // in kilograms
		        double heightMeters = 1.65;  // in meters
		        double bmi = weight / (heightMeters * heightMeters);
		        System.out.println("10. Body Mass Index (BMI) = " + bmi);
		    }
		

	}


