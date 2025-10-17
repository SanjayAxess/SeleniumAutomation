package Task6Operators.ArthematicOperator;

import java.util.Scanner;

public class ModolusOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first Numeber:");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second Numeber:");
        double num2=scanner.nextDouble();
        double modulus;
        System.out.println((modulus=num1%num2)+ " is the remainder for modolus of two numbers");
    }
}
