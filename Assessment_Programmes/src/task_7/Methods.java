package task_7;

public class Methods {

			
		    // 1. Greeting Method
		    static void greeting() {
		        System.out.println("Hello! Welcome to Java Methods.");
		    }

		    // 2. Sum Method
		    static int sum(int a, int b) {
		        return a + b;
		    }

		    // 3. Max Method
		    static int max(int a, int b) {
		        return (a > b) ? a : b;
		    }

		    // 4. Palindrome Checker
		    static boolean isPalindrome(int num) {
		        int original = num, reversed = 0;
		        while (num != 0) {
		            int digit = num % 10;
		            reversed = reversed * 10 + digit;
		            num /= 10;
		        }
		        return original == reversed;
		    }

		    // 5. Factorial Method
		    static int factorial(int n) {
		        int fact = 1;
		        for (int i = 1; i <= n; i++) {
		            fact *= i;
		        }
		        return fact;
		    }

		    // 6. Circle Area Method
		    static double circleArea(double radius) {
		        return Math.PI * radius * radius;
		    }

		    // 7. Even or Odd Method
		    static void evenOrOdd(int n) {
		        if (n % 2 == 0)
		            System.out.println(n + " is Even");
		        else
		            System.out.println(n + " is Odd");
		    }

		    // 8. Prime Method
		    static boolean isPrime(int n) {
		        if (n <= 1)
		            return false;
		        for (int i = 2; i <= n / 2; i++) {
		            if (n % i == 0)
		                return false;
		        }
		        return true;
		    }

		    // 9. Swap Method
		    static void swap(int a, int b) {
		        System.out.println("Before Swap: a = " + a + ", b = " + b);
		        int temp = a;
		        a = b;
		        b = temp;
		        System.out.println("After Swap: a = " + a + ", b = " + b);
		    }

		    // 10. Reverse String Method
		    static String reverseString(String str) {
		        String rev = "";
		        for (int i = str.length() - 1; i >= 0; i--) {
		            rev += str.charAt(i);
		        }
		        return rev;
		    }

		    // Main Method to call all others
		    public static void main(String[] args) {
		        greeting();
		        System.out.println("Sum: " + sum(5, 10));
		        System.out.println("Max: " + max(7, 3));
		        System.out.println("Is Palindrome (121): " + isPalindrome(121));
		        System.out.println("Factorial of 5: " + factorial(5));
		        System.out.println("Area of Circle (r=3): " + circleArea(3));
		        evenOrOdd(8);
		        System.out.println("Is Prime (11): " + isPrime(11));
		        swap(10, 20);
		        System.out.println("Reverse of 'Java': " + reverseString("Java"));
		    }
		}


