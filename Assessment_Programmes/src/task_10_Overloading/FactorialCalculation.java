package task_10_Overloading;

public class FactorialCalculation {

    // Method to calculate factorial of an integer
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Overloaded method to calculate factorial of a double (by converting to int)
    public static double factorial(double n) {
        double fact = 1;
        int limit = (int) n;  // Convert double to integer for factorial logic
        for (int i = 1; i <= limit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test both versions
    public static void main(String[] args) {
        int num1 = 5;
        double num2 = 6.0;

        System.out.println("Factorial of integer " + num1 + " = " + factorial(num1));
        System.out.println("Factorial of double " + num2 + " = " + factorial(num2));
    }
}

