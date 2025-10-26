package Tasks2;

public class Task2 {
    public void Arithematics(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of " + a + " and " + b + " is: " + sum);
        int subract = a - b;
        System.out.println("Subtraction of " + b + " from " + a + " is: " + subract);
        int product = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + product);
        int divide = a / b;
        System.out.println("Division of " + a + " and " + b + " is: " + divide);
        int modulus = a % b;
        System.out.println("Division of " + a + " and " + b + " is: " + modulus);
    }

    public void Relational(int a, int b){
        System.out.println(a + " == " + b + " -> " + (a == b));
        System.out.println(a + " != " + b + " -> " + (a != b));
        System.out.println(a + " > " + b + " -> " + (a > b));
        System.out.println(a + " < " + b + " -> " + (a < b));
        System.out.println(a + " >= " + b + " -> " + (a >= b));
        System.out.println(a + " <= " + b + " -> " + (a <= b));
    }

    public void And(int age, boolean ID){
        if (age >= 18 && ID) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    }

    public void Or(boolean age, boolean IDS){
        if (age || IDS) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    public void Not(boolean Verified){
        if (!Verified) {
            System.out.println("User is not Verified");
        } else {
            System.out.println("Use is Verified");
        }
    }

    public void findMinimum(int a, int b, int c) {
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("Minimum of " + a + ", " + b + ", " + c + " is: " + min);
    }

    public void checkEvenOdd(int num) {
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }

    public void assignGrade(int score) {
        String grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" :
                                (score >= 60) ? "D" : "F";
        System.out.println("Score: " + score + " -> Grade: " + grade);
    }

    public void checkSign(int num) {
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(num + " is " + result);
    }

    public void absoluteValue(int num) {
        int abs = (num < 0) ? -num : num;
        System.out.println("Absolute value of " + num + " is: " + abs);
    }

    public void checkLeapYear(int year) {
        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";
        System.out.println(year + " is a " + result);
    }
    public static void main(String[] args) {
        Task2 t2 = new Task2();
//        t2.Arithematics(2, 2);
//        t2.Relational(22,25);
//        t2.And(18, true);
//        t2.Or(false, false);
//        t2.Not(false);
//        t2.findMinimum(15, 5, 18);
//        t2.checkEvenOdd(15);
//        t2.assignGrade(75);
//        t2.checkSign(-235);
//        t2.absoluteValue(-452);
//        t2.checkLeapYear(2025);

    }
}

