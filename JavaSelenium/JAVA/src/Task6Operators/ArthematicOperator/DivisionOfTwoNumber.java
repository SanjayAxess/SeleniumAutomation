package Task6Operators.ArthematicOperator;

import java.util.Scanner;

public class DivisionOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second Number:");
        double num2=scanner.nextDouble();
        double division;
        System.out.println((division=num1/num2)+ " is the division of two numbers");
    }
}
