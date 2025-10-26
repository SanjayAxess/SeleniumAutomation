package Tasks1;

public class Task1 {
    int age = 26;
    double height = 153.55;
    char initial = 'S';
    boolean name = true;


    public void getdetails(){
        String result = "Age: " + age + " Height: " + height + " initial: " + initial + " name: " + name;
        System.out.println(result);
    }
    public void swap(int a, int b){
        System.out.println("Before Swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public void circle(double radius){
        double circles = Math.PI * radius * radius;
        System.out.println("Area of the Circle is: " + circles);
    }

    public void simpleInterest(double principal, double rate, double time){
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: $" + interest);
    }

    public void Farenheits(double celsius){
        double Farenheit = (celsius * 9/5) + 32;
        System.out.println("Farenheit is:" + Farenheit);
    }

    public void sum(int a, int b){
        int sums = a + b;
        System.out.println("Sum is:" + sums);
    }

    public void product(double num1, double num2){
        double products = num1 * num2;
        System.out.println("Product is:" + products);
    }

    public void rectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle is:" + area);
    }

    public void square(double sides) {
        double perimeter = 4 * sides;
        System.out.println("Perimeter of square is:" + perimeter);
    }

    public void BMI(double weight, double height) {
        double bmi = weight / (height * height);
        System.out.println("BMI is:" + bmi);
    }

    public void Arithemetic(int a, int b) {
        System.out.println("Addition is:" + (a+b));
        System.out.println("Subracction is:" + (a-b));
        System.out.println("Multiplication is:" + (a*b));
        System.out.println("Division is:" + (a/b));
    }

    public void modulusOp(int a, int b) {
        System.out.println("Remainder: " + (a % b));

    }

    public void incDec(int num) {
        System.out.println("After Increment: " + (++num));
        System.out.println("After Decrement: " + (--num));

    }

    public void circleCircumference(double radius) {
        double circumference = Math.PI * radius * radius;
        System.out.println("Circumference: " + circumference);
    }

    public void averageOfThree(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average: " + avg);
    }

    public void metersToKm(double meters) {
        double km = meters / 1000;
        System.out.println(meters + " meters = " + km + " km");
    }

    public void currencyConverter(double usd) {
        double rate = 87.63; // Example rate
        double inr = usd * rate;
        System.out.println("USD: $" + usd);
        System.out.println("INR:" + inr);
    }

    public void tipCalculator(double bill, double tipPercent) {
        double tip = (bill * tipPercent) / 100;
        System.out.println("Bill:" + bill);
        System.out.println("Tip:" + tip);
        System.out.println("Total:" + (bill + tip));
    }

    public void totalCost(double price, double taxPercent) {
        double tax = (price * taxPercent) / 100;
        double total = price + tax;
        System.out.println("Price:" + price);
        System.out.println("Tax:" + tax);
        System.out.println("Total Cost:" + total);
    }

    public void checkEvenOdd(int num) {
        System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
    }

    public void checkSign(int num) {
        if (num > 0)
            System.out.println(num + " is Positive");
        else if (num < 0)
            System.out.println(num + " is Negative");
        else
            System.out.println("Number is Zero");
    }

    public void findLargest(int a, int b, int c) {
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest: " + largest);
    }

    public void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");
    }

    public void calculateGrade(int marks) {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 80)
            System.out.println("Grade: B");
        else if (marks >= 70)
            System.out.println("Grade: C");
        else if (marks >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }

    public void sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println("Sum: " + sum);
    }

    public void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num * i));
    }

    public void fibonacciSeries(int count) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < count; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }

    public void greet() {
        System.out.println("Hello! Welcome to Java.");
    }

    public void sums(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    public void findMax(int x, int y) {
        int max = (x > y) ? x : y;
        System.out.println("Maximum of " + x + " and " + y + " is: " + max);
    }

    public void isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(original + (original == reversed ? " is a Palindrome" : " is not a Palindrome"));
    }

    public void reversedString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }




    public static void main(String[] args) {
        Task1 p = new Task1();
//        p.getdetails();
//        p.swap(20, 30);
//        p.circle(7.0);
//        p.simpleInterest(500.5, 6.5, 3);
//        p.Farenheits(40);
//        p.sum(10,20);
//        p.product(12.5, 3.4);
//        p.rectangle(12.5, 3.4);
//        p.square(12.5);
//        p.BMI(68.0, 1.75);
//        p.Arithemetic(2,2);
//        p.modulusOp(17, 5);
//        p.incDec(10);
//        p.circleCircumference(7.0);
//        p.averageOfThree(10, 20, 30);
//        p.metersToKm(2500);
//        p.currencyConverter(100);
//        p.tipCalculator(850, 10);
//        p.totalCost(1200, 18);
//        p.checkEvenOdd(17);
//        p.checkSign(-5);
//        p.findLargest(45, 78, 32);
//        p.checkLeapYear(2024);
//        p.calculateGrade(85);
//        p.sumNaturalNumbers(10);
//        p.factorial(5);
//        p.multiplicationTable(7);
//        p.fibonacciSeries(10);
//        p.greet();
//        p.sum(10, 20);
//        p.findMax(45, 78);
//        p.isPalindrome(121);
//        p.reversedString("Ramanan");


    }
}

