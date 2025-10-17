package task_10_Overloading;

public class Sumcalculation {

    // Sum of two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Sum of two doubles
    public double sum(double a, double b) {
        return a + b;
    }

    // Sum of an integer and a double
    public double sum(int a, double b) {
        return a + b;
    }

    // Sum of a double and an integer
    public double sum(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    	Sumcalculation calculator = new Sumcalculation();

        System.out.println("Sum of integers: " + calculator.sum(5, 10));
        System.out.println("Sum of doubles: " + calculator.sum(4.5, 3.2));
        System.out.println("Sum of int and double: " + calculator.sum(5, 3.2));
        System.out.println("Sum of double and int: " + calculator.sum(4.1, 2));
    }
}
