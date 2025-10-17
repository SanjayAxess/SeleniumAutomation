package task_4;

public class Ifelseforloop_simple {

	public static void main(String[] args) {
		
		        // 1. Positive or Negative
		        checkPositiveNegative(-3);

		        // 2. Odd or Even
		        checkOddEven(7);

		        // 3. Vowel or Consonant
		        checkVowelConsonant('e');

		        // 4. Grade Assignment
		        assignGrade(85);

		        // 5. Check Eligibility to Vote
		        checkVotingEligibility(20);

		        // 6. Largest of Two Numbers
		        largestOfTwo(12, 8);

		        // 7. Leap Year Check
		        checkLeapYear(2024);

		        // 8. Print Numbers 1 to 10
		        printOneToTen();

		        // 9. Sum of First N Natural Numbers
		        sumFirstNNatural(10);

		        // 10. Reverse a String
		        reverseString("Hello");

		        // 11. Factorial Calculation
		        factorial(5);

		        // 12. Multiplication Table
		        multiplicationTable(6);

		        // 13. First 10 Odd Numbers
		        first10OddNumbers();

		        // 14. Reverse Order 10 to 1
		        reverseTenToOne();

		        // 15. Fibonacci Series (first 10 numbers)
		        fibonacciSeries(10);

		        // 16. Prime Check
		        checkPrime(29);

		        // 17. Power of a Number
		        calculatePower(2, 5);

		        // 18. Palindrome Check
		        checkPalindrome("madam");

		        // 19. Largest of Three Numbers
		        largestOfThree(25, 30, 20);

		        // 20. Sum of Even Numbers
		        sumEvenNumbers(20);

		        // 21. Check Divisibility by 5
		        checkDivisibleByFive(25);

		        // 22. Simple Login System
		        loginSystem("admin", "1234");
		    }

		    // 1
		    static void checkPositiveNegative(int num) {
		        if (num > 0)
		            System.out.println(num + " is Positive");
		        else if (num < 0)
		            System.out.println(num + " is Negative");
		        else
		            System.out.println("Number is Zero");
		    }

		    // 2
		    static void checkOddEven(int num) {
		        if (num % 2 == 0)
		            System.out.println(num + " is Even");
		        else
		            System.out.println(num + " is Odd");
		    }

		    // 3
		    static void checkVowelConsonant(char ch) {
		        ch = Character.toLowerCase(ch);
		        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		            System.out.println(ch + " is a Vowel");
		        else
		            System.out.println(ch + " is a Consonant");
		    }

		    // 4
		    static void assignGrade(int score) {
		        if (score >= 90)
		            System.out.println("Grade: A");
		        else if (score >= 80)
		            System.out.println("Grade: B");
		        else if (score >= 70)
		            System.out.println("Grade: C");
		        else if (score >= 60)
		            System.out.println("Grade: D");
		        else
		            System.out.println("Grade: F");
		    }

		    // 5
		    static void checkVotingEligibility(int age) {
		        if (age >= 18)
		            System.out.println("Eligible to vote");
		        else
		            System.out.println("Not eligible to vote");
		    }

		    // 6
		    static void largestOfTwo(int a, int b) {
		        if (a > b)
		            System.out.println(a + " is larger");
		        else
		            System.out.println(b + " is larger");
		    }

		    // 7
		    static void checkLeapYear(int year) {
		        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		            System.out.println(year + " is a Leap Year");
		        else
		            System.out.println(year + " is not a Leap Year");
		    }

		    // 8
		    static void printOneToTen() {
		        for (int i = 1; i <= 10; i++)
		            System.out.print(i + " ");
		        System.out.println();
		    }

		    // 9
		    static void sumFirstNNatural(int n) {
		        int sum = 0;
		        for (int i = 1; i <= n; i++)
		            sum += i;
		        System.out.println("Sum = " + sum);
		    }

		    // 10
		    static void reverseString(String str) {
		        String rev = "";
		        for (int i = str.length() - 1; i >= 0; i--)
		            rev += str.charAt(i);
		        System.out.println("Reversed: " + rev);
		    }

		    // 11
		    static void factorial(int num) {
		        int fact = 1;
		        for (int i = 1; i <= num; i++)
		            fact *= i;
		        System.out.println("Factorial: " + fact);
		    }

		    // 12
		    static void multiplicationTable(int num) {
		        for (int i = 1; i <= 10; i++)
		            System.out.println(num + " x " + i + " = " + (num * i));
		    }

		    // 13
		    static void first10OddNumbers() {
		        for (int i = 1, count = 0; count < 10; i += 2, count++)
		            System.out.print(i + " ");
		        System.out.println();
		    }

		    // 14
		    static void reverseTenToOne() {
		        for (int i = 10; i >= 1; i--)
		            System.out.print(i + " ");
		        System.out.println();
		    }

		    // 15
		    static void fibonacciSeries(int n) {
		        int a = 0, b = 1;
		        System.out.print(a + " " + b + " ");
		        for (int i = 3; i <= n; i++) {
		            int c = a + b;
		            System.out.print(c + " ");
		            a = b;
		            b = c;
		        }
		        System.out.println();
		    }

		    // 16
		    static void checkPrime(int num) {
		        boolean prime = true;
		        if (num <= 1) prime = false;
		        else {
		            for (int i = 2; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    prime = false;
		                    break;
		                }
		            }
		        }
		        if (prime)
		            System.out.println(num + " is a Prime number");
		        else
		            System.out.println(num + " is not a Prime number");
		    }

		    // 17
		    static void calculatePower(int base, int exponent) {
		        int result = 1;
		        for (int i = 1; i <= exponent; i++)
		            result *= base;
		        System.out.println(base + "^" + exponent + " = " + result);
		    }

		    // 18
		    static void checkPalindrome(String str) {
		        String rev = "";
		        for (int i = str.length() - 1; i >= 0; i--)
		            rev += str.charAt(i);
		        if (str.equals(rev))
		            System.out.println(str + " is a Palindrome");
		        else
		            System.out.println(str + " is not a Palindrome");
		    }

		    // 19
		    static void largestOfThree(int a, int b, int c) {
		        if (a >= b && a >= c)
		            System.out.println(a + " is the largest");
		        else if (b >= a && b >= c)
		            System.out.println(b + " is the largest");
		        else
		            System.out.println(c + " is the largest");
		    }

		    // 20
		    static void sumEvenNumbers(int limit) {
		        int sum = 0;
		        for (int i = 2; i <= limit; i += 2)
		            sum += i;
		        System.out.println("Sum of even numbers: " + sum);
		    }

		    // 21
		    static void checkDivisibleByFive(int num) {
		        if (num % 5 == 0)
		            System.out.println(num + " is divisible by 5");
		        else
		            System.out.println(num + " is not divisible by 5");
		    }

		    // 22
		    static void loginSystem(String username, String password) {
		        String validUser = "admin";
		        String validPass = "1234";
		        if (username.equals(validUser) && password.equals(validPass))
		            System.out.println("Login successful");
		        else
		            System.out.println("Invalid username or password");
		    }
		}

