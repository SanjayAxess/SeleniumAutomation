package Task4SwitchAndBreak.MediumLevelProblems;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            // Display menu
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }


            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-5).");
            }

        } while (true);

        scanner.close();
    }
}
