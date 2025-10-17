package Basics;

import java.util.Scanner;

public class Conditional {
    Scanner sc = new Scanner(System.in);
    //int units;
    int fare = 0;

    public void conditions(int units){
        //System.out.println("Enter the units: ");
       // units = sc.nextInt();

        if(units >= 0 && units <= 800){
            if(units<= 100){
                fare = 0;
                System.out.println("Amount: " +fare);

            }else if (units <=200) {
                fare = (units - 100) * 3;
                System.out.println("Amount: " +fare);

            } else if (units <=500) {
                fare = (100 * 3) + (units - 200) * 6;
                System.out.println("Amount: " +fare);

            } else if (units <=800) {
                fare = (100 * 3) + (300 * 6) + (units - 300) * 8;
                System.out.println("Amount: " +fare);

            }

        }else {
            System.out.println("Invalid Units");
        }

    }
    public void terinary(int a){
        //System.out.println((a>b) ? "A is Bigger" : "B is Bigger");
       // int result = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
        // int result = (a>b) ? ((a>c) ? ((a>d) ? a : d) : ((c>d) ? c : d)):
        //             ((b>c) ? ((b>d) ? b : d) : ((c>d) ? c : d)); // To find Bigger number with 4 integer
        //int result = (a>b && a>c && a>d) ? a : (b>c && b>d) ? b : (c > d) ? c : d; //By using AND Operator
        //String result = ((a%2 == 0) ? "Even" : "Odd"); // To find Even or Odd
        //String grade = (a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D" : (a >= 40) ? "E" : "F"; // To find Grade
        String result = (a >= 0) ? "Positive" : "Negative"; // To find positive or Negative
        System.out.println(result);

    }


    public static void main(String[] args) {
        Conditional cs = new Conditional();
        //cs.conditions(223);
        cs.terinary(25);
    }
}
