package Tasks4;

import java.util.Scanner;

public class Task4 {


//        public void checksign(double number) {
//            if (number > 0) {
//                System.out.println("The number is positive.");
//            } else if (number < 0) {
//                System.out.println("The number is negative.");
//            } else {
//                System.out.println("The number is zero.");
//            }
//        }
//
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter a number: ");
//            double number = sc.nextDouble();
//
//            Task4 t4 = new Task4();
//            t4.checksign(number);
//
//            sc.close();
//        }
public void checkOddEven() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if (num % 2 == 0)
        System.out.println(num + " is Even.");
    else
        System.out.println(num + " is Odd.");
}


    public void checkVowelConsonant() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is a Vowel.");
        else
            System.out.println(ch + " is a Consonant.");
    }

    public void assignGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        }
        else if (score >= 80){
            System.out.println("Grade: B");
        }
        else if (score >= 70){
            System.out.println("Grade: C");
        }
        else if (score >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }

    public void checkVotingEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public void findLargest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (b > a) {
            System.out.println(b + " is larger than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public void leapYear(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int a = sc.nextInt();
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }

    public void printNum(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);

        }
    }

    public void naturalnum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }

    public void reverse(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--)
                rev += str.charAt(i);
            System.out.println("Reversed string: " + rev);
        }

    public void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " is: " + fact);
    }


    public void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num * i));
    }

    public void reverseTenToOne() {
        System.out.println("Numbers from 10 to 1:");
        for (int i = 10; i >= 1; i--)
            System.out.print(i + " ");
    }

    public void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        if(rev.equals(str)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    public void findLargestOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
    }

    public void checkDivisibleByFive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0)
            System.out.println(num + " is divisible by 5.");
        else
            System.out.println(num + " is not divisible by 5.");
    }

    public void loginSystem() {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "1234";

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void matrixAddition() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition Result:");
        for (int[] row : sum) {
            for (int val : row) {
                System.out.println(val + " ");
            }
        }
    }

    public void matrixMultiplication() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] * b[i][j];
            }
        }

        System.out.println("Matrix Addition Result:");
        for (int[] row : sum) {
            for (int val : row) {
                System.out.println(val + " ");
            }
        }
    }




    public static void main(String[] args) {
        Task4 t4 = new Task4();
        //t4.checkOddEven();
        //t4.checkVowelConsonant();
        //t4.assignGrade();
        //t4.checkVotingEligibility();
        //t4.findLargest();
        //t4.leapYear();
        //t4.printNum();
            // t4.naturalnum();
            //t4.reverse();
        //t4.factorial();
        //t4.multiplicationTable();
        //t4.reverseTenToOne();
        //t4.palindrome();
        //t4.findLargestOfThree();
        //t4.checkDivisibleByFive();
        //t4.loginSystem();
        //t4.matrixAddition();
        t4.matrixMultiplication();
    }

}


