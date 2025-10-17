package Task6Operators.ArthematicOperator;

import java.util.Scanner;

public class MultiplicationOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first Numeber:");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second Numeber:");
        double num2=scanner.nextDouble();
        double multiplication;
        System.out.println((multiplication=num1*num2)+ " is the multiplication of two numbers");
    }
}
