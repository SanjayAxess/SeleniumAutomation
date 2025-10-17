package task_3;

public class Controlstmts_decsnmaking {

	public static void main(String[] args) {
				        
		        // Example numbers for testing
		        int num1 = 10;     // For if statement
		        int num2 = -5;     // For if-else statement
		        int num3 = 0;      // For nested if statement
		        int day = 8;
		        
		        // For switch statement (1 = Monday, 2 = Tuesday, etc.)

		        // 1. if Statement - Check if a number is positive
		        if (num1 > 0) {
		            System.out.println("1. " + num1 + " is positive.");
		        }

		        // 2. if-else Statement - Check if a number is positive or negative
		        if (num2 >= 0) {
		            System.out.println("2. " + num2 + " is positive.");
		        } else {
		            System.out.println("2. " + num2 + " is negative.");
		        }

		        // 3. Nested if Statement - Check if a number is positive, negative, or zero
		        if (num3 > 0) {
		            System.out.println("3. " + num3 + " is positive.");
		        } else {
		            if (num3 < 0) {
		                System.out.println("3. " + num3 + " is negative.");
		            } else {
		                System.out.println("3. " + num3 + " is zero.");
		            }
		        }

		        // 4. switch Statement - Print day of the week based on number
		        switch (day) 
		        {
		            case 1:
		                System.out.println("1. Monday");
		                break;
		            case 2:
		                System.out.println("2. Tuesday");
		                break;
		            case 3:
		                System.out.println("3. Wednesday");
		                break;
		            case 4:
		                System.out.println("4. Thursday");
		                break;
		            case 5:
		                System.out.println("5. Friday");
		                break;
		            case 6:
		                System.out.println("6. Saturday");
		                break;
		            case 7:
		                System.out.println("7. Sunday");
		                break;
		            default:
		                System.out.println("5. Invalid day number!");
		        }
		    }
		}



