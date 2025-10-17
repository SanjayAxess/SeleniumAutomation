package task_10_Overloading;

//Program: Print Methods using Method Overloading
public class Printmethods {

 // Method to print integer
 void print(int num) {
     System.out.println("Integer: " + num);
 }

 // Method to print double
 void print(double num) {
     System.out.println("Double: " + num);
 }

 // Method to print string
 void print(String str) {
     System.out.println("String: " + str);
 }

 // Method to print integer array
 void print(int[] arr) {
     System.out.print("Integer Array: ");
     for (int num : arr) {
         System.out.print(num + " ");
     }
     System.out.println();
 }

 // Method to print string array
 void print(String[] arr) {
     System.out.print("String Array: ");
     for (String s : arr) {
         System.out.print(s + " ");
     }
     System.out.println();
 }

 // Main method to test all print methods
 public static void main(String[] args) {
	 Printmethods p = new Printmethods();

     p.print(10);                     // integer
     p.print(12.75);                  // double
     p.print("Hello Java!");          // string
     p.print(new int[]{1, 2, 3, 4});  // integer array
     p.print(new String[]{"A", "B", "C"}); // string array
 }
}

