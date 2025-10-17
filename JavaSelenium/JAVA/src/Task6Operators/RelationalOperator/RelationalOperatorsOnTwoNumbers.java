package Task6Operators.RelationalOperator;

import java.util.Scanner;

public class RelationalOperatorsOnTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second Number:");
        double num2=scanner.nextDouble();
        boolean result;
        System.out.println(result=(num1==num2));
        System.out.println(result=(num1!=num2));
        System.out.println(result=(num1>num2));
        System.out.println(result=(num1<num2));
        System.out.println(result=(num1>=num2));
        System.out.println(result=(num1<=num2));

    }
}
