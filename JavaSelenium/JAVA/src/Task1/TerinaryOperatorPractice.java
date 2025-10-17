package Task1;

import java.util.Scanner;

public class TerinaryOperatorPractice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        /*==>The ternary operator in Java is a concise replacement for simple if-else statements and follows this syntax:java
        ==>the syntax is below
        ==>result = condition ? value_if_true : value_if_false;
        ==>It evaluates the boolean condition: if true, the result is value_if_true; if false, it's value_if_false
         */
        //Assiging the integer value
        int a=5,b=15;
        int max=(a>b)?a:b;
        System.out.println(max+" is maxium number");

        //2.assign a string
        int age=18;
        String eligibility=(age>=18)?("Eligible for Vote"):("Note Eligible for Vote");
        System.out.println(eligibility);
        //Check even or odd
        int number=5;
        String result=(number%2==0)?("Number is even"):("Number is odd");
        System.out.println(result);
        System.out.println((number%2==0)?("Number is even"):("Number is Odd"));

        //Assign the boolena
        int score=58;
        boolean passed=(score>=40)?true:false;
        System.out.println("passed:"+passed);

        //in-ling printing the result
        double temaparature=16.8;
        System.out.println("Weather is " +((temaparature>=35)?"warm":"cold"));

        //nested if
        int x=4,y=7,z=2;
        int min = (x < y) ? (( x < z)? x : z) : (( y < z ) ? y : z);
        System.out.println("Minimum Number is "+min);









    }
}
