package task_5;

public class Switchandbreak_01 {

	public static void main(String[] args) {
		
		        // 1. Simple Calculator
		        int a = 10, b = 5;
		        char operator = '+';  // Try '+', '-', '*', or '/'
		        switch (operator) {
		            case '+':
		                System.out.println("Sum: " + (a + b));
		                break;
		            case '-':
		                System.out.println("Difference: " + (a - b));
		                break;
		            case '*':
		                System.out.println("Product: " + (a * b));
		                break;
		            case '/':
		                System.out.println("Quotient: " + (a / b));
		                break;
		            default:
		                System.out.println("Invalid operator");
		        }

		        // 2. Print Day of the Week
		        int day = 3;  // 1 for Monday, 2 for Tuesday, etc.
		        switch (day) {
		            case 1:
		                System.out.println("Monday");
		                break;
		            case 2:
		                System.out.println("Tuesday");
		                break;
		            case 3:
		                System.out.println("Wednesday");
		                break;
		            case 4:
		                System.out.println("Thursday");
		                break;
		            case 5:
		                System.out.println("Friday");
		                break;
		            case 6:
		                System.out.println("Saturday");
		                break;
		            case 7:
		                System.out.println("Sunday");
		                break;
		            default:
		                System.out.println("Invalid day number");
		        }

		        // 3. Grade Calculator
		        int score = 85;  // Assign any number between 0–100
		        char grade;
		        if (score >= 90) grade = 'A';
		        else if (score >= 80) grade = 'B';
		        else if (score >= 70) grade = 'C';
		        else if (score >= 60) grade = 'D';
		        else grade = 'F';
		        System.out.println("Grade: " + grade);

		        // 4. Traffic Light System
		        String color = "green";  // Try "red", "yellow", "green"
		        switch (color) {
		            case "red":
		                System.out.println("STOP");
		                break;
		            case "yellow":
		                System.out.println("READY");
		                break;
		            case "green":
		                System.out.println("GO");
		                break;
		            default:
		                System.out.println("Invalid color");
		        }

		        // 5. Month Names
		        int month = 10;  // 1 for January, 2 for February, etc.
		        switch (month) {
		            case 1:
		                System.out.println("January");
		                break;
		            case 2:
		                System.out.println("February");
		                break;
		            case 3:
		                System.out.println("March");
		                break;
		            case 4:
		                System.out.println("April");
		                break;
		            case 5:
		                System.out.println("May");
		                break;
		            case 6:
		                System.out.println("June");
		                break;
		            case 7:
		                System.out.println("July");
		                break;
		            case 8:
		                System.out.println("August");
		                break;
		            case 9:
		                System.out.println("September");
		                break;
		            case 10:
		                System.out.println("October");
		                break;
		            case 11:
		                System.out.println("November");
		                break;
		            case 12:
		                System.out.println("December");
		                break;
		            default:
		                System.out.println("Invalid month number");
		        }
		    }
		}


