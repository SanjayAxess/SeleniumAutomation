package Tasks5;

import java.util.Scanner;

public class Task5 {

    public void simpleCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char s = sc.next().charAt(0);

        switch (s) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    public void printDayOfWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }

    public void gradeCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score (0–100): ");
        int score = sc.nextInt();
        char grade;

        switch (score / 10) {
            case 10:
                grade = 'A';
                break;
            case 9:
                grade = 'B';
                break;
            case 8:
                grade = 'C';
                break;
            case 7:
                grade = 'D';
                break;
            case 6:
                grade = 'E';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }

    public void trafficLightSystem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color (red/yellow/green): ");
        String color = sc.next();

        switch (color) {
            case "red":
                System.out.println("Stop!");
                break;
            case "yellow":
                System.out.println("Get Ready!");
                break;
            case "green":
                System.out.println("Go!");
                break;
            default:
                System.out.println("Invalid color.");
        }
    }

    public void printMonthName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1–12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number.");
        }
    }

    public void menuCalculator() {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\n--- Calculator Menu ---");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        if (choice >= 1 && choice <= 4) {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    System.out.println("Result: " + (a / b));
                    break;
            }
        } else {
            System.out.println("Calculator exit - Thank You");
        }
    }

    public void monthDays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1–12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days non-leap year");
                break;
            default:
                System.out.println("Invalid month number.");
        }
    }

    public void gradePoint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter letter grade (A/B/C/D/F): ");
        char grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Grade Point: 4.0");
                break;
            case 'B':
                System.out.println("Grade Point: 3.0");
                break;
            case 'C':
                System.out.println("Grade Point: 2.0");
                break;
            case 'D':
                System.out.println("Grade Point: 1.0");
                break;
            case 'F':
                System.out.println("Grade Point: 0.0");
            break;
            default:
               System.out.println("Invalid grade.");
        }
    }

    public void vendingMachine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a product:");
        System.out.println("1. Chips\n2. Soda\n3. Candy");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected: Chips");
                break;
            case 2:
                System.out.println("You selected: Soda");
                break;
            case 3:
                System.out.println("You selected: Candy");
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }

    public void activityPlanner() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1–7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday: Start fresh with planning.");
                break;
            case 2:
                System.out.println("Tuesday: Focus on coding practice.");
                break;
            case 3:
                System.out.println("Wednesday: Attend training or revise.");
                break;
            case 4:
                System.out.println("Thursday: Work on spoken English.");
                break;
            case 5:
                System.out.println("Friday: Review weekly progress.");
                break;
            case 6:
                System.out.println("Saturday: Explore new topics.");
                break;
            case 7:
                System.out.println("Sunday: Relax.");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }






    public static void main (String[]args){
            Task5 t5 = new Task5();
            //t5.simpleCalculator();
            //t5.printDayOfWeek();
            //t5.gradeCalculator();
            //t5.trafficLightSystem();
            //t5.printMonthName();
            //t5.menuCalculator();
        //t5.monthDays();
        //t5.gradePoint();
        //t5.vendingMachine();
        t5.activityPlanner();
        }
    }



