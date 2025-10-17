package Task6Operators.ArthematicOperator;

import java.util.Scanner;

public class SubtractOneFromAnotherNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second Number:");
        double num2=scanner.nextDouble();
        double subtraction;
        System.out.println((subtraction=num1-num2)+ " is the subtraction of two numbers");
    }
}
