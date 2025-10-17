package task_3;

public class Jumpstmts {

			// 1. Using break statement
		    static void breakExample() {
		        System.out.println("1. Using break statement:");
		        for (int i = 1; i <= 10; i++) {
		            if (i == 5) {
		                System.out.println("Loop stopped at number: " + i);
		                break; // exits the loop when i = 5
		            }
		            System.out.println(i);
		        }
		        System.out.println();
		    }

		    // 2. Using continue statement
		    static void continueExample() {
		        System.out.println("2. Using continue statement:");
		        for (int i = 1; i <= 10; i++) {
		            if (i == 5) {
		                continue; // skips printing when i = 5
		            }
		            System.out.println(i);
		        }
		        System.out.println();
		    }

		    // 3. Using return statement
		    static String returnExample(int num) {
		        if (num > 0)
		            return num + " is Positive";
		        else if (num < 0)
		            return num + " is Negative";
		        else
		            return num + " is Zero";
		    }

		    // 4. Using all jump statements in one program
		    static void allJumpStatements() {
		        System.out.println("4. Using break, continue, and return together:");
		        for (int i = 1; i <= 10; i++) {
		            if (i == 3) {
		                System.out.println("Skipping number " + i + " using continue");
		                continue;
		            }
		            if (i == 6) {
		                System.out.println("Breaking the loop at number " + i);
		                break;
		            }
		            if (i == 9) {
		                System.out.println("Returning from the method at number " + i);
		                return; // exits the method completely
		            }
		            System.out.println("Number: " + i);
		        }
		        System.out.println("This line will not print if return is executed above.");
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        breakExample();
		        continueExample();

		        System.out.println("3. Using return statement:");
		        System.out.println(returnExample(10));
		        System.out.println(returnExample(-3));
		        System.out.println(returnExample(0));
		        System.out.println();

		        allJumpStatements();

		        System.out.println("Program Ended Normally.");
		    }
		}

