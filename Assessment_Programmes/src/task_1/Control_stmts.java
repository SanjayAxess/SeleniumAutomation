package task_1;

public class Control_stmts {

	public static void main(String[] args) {
				// 1. Even or Odd
		        int num1 = 5;
		        System.out.println("1️⃣ Even or Odd:");
		        if (num1 % 2 == 0)
		            System.out.println(num1 + " is Even");
		        else
		            System.out.println(num1 + " is Odd");
		        System.out.println();

		        // 2. Positive or Negative
		        int num2 = -8;
		        System.out.println("2️⃣ Positive or Negative:");
		        if (num2 > 0)
		            System.out.println(num2 + " is Positive");
		        else if (num2 < 0)
		            System.out.println(num2 + " is Negative");
		        else
		            System.out.println("Zero");
		        System.out.println();

		        // 3. Largest of Three Numbers
		        int a = 10, b = 25, c = 15;
		        System.out.println("3️⃣ Largest of Three Numbers:");
		        if (a >= b && a >= c)
		            System.out.println("Largest: " + a);
		        else if (b >= a && b >= c)
		            System.out.println("Largest: " + b);
		        else
		            System.out.println("Largest: " + c);
		        System.out.println();

		        // 4. Leap Year Checker
		        int year = 2024;
		        System.out.println("4️⃣ Leap Year Checker:");
		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		            System.out.println(year + " is a Leap Year");
		        else
		            System.out.println(year + " is Not a Leap Year");
		        System.out.println();

		        // 5. Grade Calculator
		        int marks = 85;
		        System.out.println("5️⃣ Grade Calculator:");
		        if (marks >= 90)
		            System.out.println("Grade: A+");
		        else if (marks >= 80)
		            System.out.println("Grade: A");
		        else if (marks >= 70)
		            System.out.println("Grade: B");
		        else if (marks >= 60)
		            System.out.println("Grade: C");
		        else if (marks >= 50)
		            System.out.println("Grade: D");
		        else
		            System.out.println("Fail");
		        System.out.println();

		        // 6. Sum of Natural Numbers
		        int n = 10, sum = 0;
		        System.out.println("6️⃣ Sum of first " + n + " natural numbers:");
		        for (int i = 1; i <= n; i++)
		            sum += i;
		        System.out.println("Sum = " + sum);
		        System.out.println();

		        // 7. Factorial
		        int num3 = 5, fact = 1;
		        System.out.println("7️⃣ Factorial:");
		        for (int i = 1; i <= num3; i++)
		            fact *= i;
		        System.out.println("Factorial of " + num3 + " = " + fact);
		        System.out.println();

		        // 8. Multiplication Table
		        int num4 = 7;
		        System.out.println("8️⃣ Multiplication Table of " + num4 + ":");
		        for (int i = 1; i <= 10; i++)
		            System.out.println(num4 + " x " + i + " = " + (num4 * i));
		        System.out.println();

		        // 9. Fibonacci Series
		        int terms = 10;
		        System.out.println("9️⃣ Fibonacci Series up to " + terms + " terms:");
		        int first = 0, second = 1;
		        System.out.print(first + " " + second);
		        for (int i = 2; i < terms; i++) {
		            int next = first + second;
		            System.out.print(" " + next);
		            first = second;
		            second = next;
		        }
		        System.out.println("\n");

		        // 10. Prime Number Checker
		        int num5 = 29;
		        System.out.println("🔟 Prime Number Checker:");
		        boolean prime = true;
		        if (num5 <= 1)
		            prime = false;
		        else {
		            for (int i = 2; i <= num5 / 2; i++) {
		                if (num5 % i == 0) {
		                    prime = false;
		                    break;
		                }
		            }
		        }
		        if (prime)
		            System.out.println(num5 + " is Prime");
		        else
		            System.out.println(num5 + " is Not Prime");
		    }
		}

