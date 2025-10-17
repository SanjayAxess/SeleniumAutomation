package task_1;

	public class Methods {

			// 1. Greeting Method
		    static void greeting() {
		        System.out.println("Hello! Welcome to Java Programming.");
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
		        int original = num, rev = 0;
		        while (num != 0) {
		            rev = rev * 10 + num % 10;
		            num /= 10;
		        }
		        return original == rev;
		    }

		    // 5. Factorial Method
		    static long factorial(int n) {
		        long fact = 1;
		        for (int i = 1; i <= n; i++) {
		            fact *= i;
		        }
		        return fact;
		    }

		    // 6. Circle Area Method
		    static double circleArea(double radius) {
		        return 3.14159 * radius * radius;
		    }

		    // 7. Even or Odd Method
		    static String evenOrOdd(int num) {
		        return (num % 2 == 0) ? "Even" : "Odd";
		    }

		    // 8. Prime Method
		    static boolean isPrime(int num) {
		        if (num <= 1) return false;
		        for (int i = 2; i <= num / 2; i++) {
		            if (num % i == 0) return false;
		        }
		        return true;
		    }

		    // 9. Swap Method
		    static void swap(int a, int b) {
		        System.out.println("Before swap: a = " + a + ", b = " + b);
		        int temp = a;
		        a = b;
		        b = temp;
		        System.out.println("After swap: a = " + a + ", b = " + b);
		    }

		    // 10. Reverse String Method
		    static String reverseString(String str) {
		        String rev = "";
		        for (int i = str.length() - 1; i >= 0; i--) {
		            rev += str.charAt(i);
		        }
		        return rev;
		    }

		    // Main Method
		    public static void main(String[] args) {
		        greeting();

		        System.out.println("Sum of 5 and 7 = " + sum(5, 7));
		        System.out.println("Max of 10 and 20 = " + max(10, 20));
		        System.out.println("Is 121 Palindrome? " + isPalindrome(121));
		        System.out.println("Factorial of 5 = " + factorial(5));
		        System.out.println("Area of circle (radius 4) = " + circleArea(4));
		        System.out.println("8 is " + evenOrOdd(8));
		        System.out.println("Is 11 Prime? " + isPrime(11));
		        swap(10, 20);
		        System.out.println("Reverse of 'Java' = " + reverseString("Java"));
		    }
		}


