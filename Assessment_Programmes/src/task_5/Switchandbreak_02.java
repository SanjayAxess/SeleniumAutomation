package task_5;

public class Switchandbreak_02 {

	public static void main(String[] args) {
		// Menu-Driven Program
		        int choice = 0;
		        int num1 = 10; 
		        int num2 = 5;
		        while (choice != 5) {
		            choice = 2;  
		            switch (choice) {
		                case 1:
		                    System.out.println("Addition: " + (num1 + num2));
		                    break;
		                case 2:
		                    System.out.println("Subtraction: " + (num1 - num2));
		                    break;
		                case 3:
		                    System.out.println("Multiplication: " + (num1 * num2));
		                    break;
		                case 4:
		                    if (num2 != 0) System.out.println("Division: " + ((double) num1 / num2));
		                    else System.out.println("Cannot divide by zero");
		                    break;
		                case 5:
		                    System.out.println("Exiting program");
		                    break;
		                default:
		                    System.out.println("Invalid choice");
		            }
		            break;
		        }
		        
		        
		        // Month Number to Days Conversion 
		        int month = 2; 
		        int days = 0;
		        switch (month) {
		            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		                days = 31;
		                break;
		            case 4: case 6: case 9: case 11:
		                days = 30;
		                break;
		            case 2:
		                days = 28; 
		                break;
		            default:
		                System.out.println("Invalid month");
		                System.exit(0);
		        }
		        System.out.println("Days in month " + month + ": " + days);
		        
		        //Grade Point Average Calculation 
		        		char grade = 'C'; // example grade
		                double gradePoint;
		                switch (grade) {
		                    case 'A':
		                        gradePoint = 4.0;
		                        break;
		                    case 'B':
		                        gradePoint = 3.0;
		                        break;
		                    case 'C':
		                        gradePoint = 2.0;
		                        break;
		                    case 'D':
		                        gradePoint = 1.0;
		                        break;
		                    case 'F':
		                        gradePoint = 0.0;
		                        break;
		                    default:
		                        System.out.println("Invalid grade");
		                        return;
		                }
		                System.out.println("Grade point for " + grade + ": " + gradePoint);

		         // Simple vending machine
		                		int choice1 = 2;
		                        switch (choice1) {
		                            case 1:
		                                System.out.println("Chips");
		                                break;
		                            case 2:
		                                System.out.println("Soda");
		                                break;
		                            case 3:
		                                System.out.println("Candy");
		                                break;
		                            default:
		                                System.out.println("Invalid selection");
		                        		                    }
		                        
		          // Day to activity planner
		               int day = 1; // example day
		               String activity;
		               switch (day) {
		                   case 1:
		                   activity = "Go for a walk";
		                   break;
		                   case 2:
		                   activity = "Read a book";
		                   break;
		                   case 3:
		                   activity = "Visit friends";
		                   break;
		                   case 4:
		                   activity = "Watch a movie";
		                   break;
		                   case 5:
		                   activity = "Go shopping";
		                   break;
		                   case 6:
		                   activity = "Exercise";
		                   break;
		                   case 7:
		                   activity = "Rest and relax";
		                   break;
		                   default:
		                   activity = "Invalid day";
		                   }
		                   System.out.println("Activity for day " + day + ": " + activity);
		                           }
}

		   
		 


        


