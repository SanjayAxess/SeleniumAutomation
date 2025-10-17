package task_9;

//Calculator class demonstrating Method Overloading
class Calculator {

 // Method to add two integers
 int add(int a, int b) {
     return a + b;
 }

 // Method to add three integers
 int add(int a, int b, int c) {
     return a + b + c;
 }

 // Method to add two double values
 double add(double a, double b) {
     return a + b;
 }


//Main class to test Calculator

 public static void main(String[] args) {
     Calculator calc = new Calculator();

     // Using add(int, int)
     int sum1 = calc.add(5, 10);
     System.out.println("Sum of 2 integers: " + sum1);

     // Using add(int, int, int)
     int sum2 = calc.add(5, 10, 15);
     System.out.println("Sum of 3 integers: " + sum2);

     // Using add(double, double)
     double sum3 = calc.add(5.5, 10.5);
     System.out.println("Sum of 2 doubles: " + sum3);
 }
}
