package Task6Operators.LogicalOperator;

import java.util.Scanner;

public class AllLogicalOperatorsOnBothCondtions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second Number:");
        double num2=scanner.nextDouble();
        boolean condition1=num1>num2,condition2=num1<num2;
        System.out.println("Result is " +(condition1&&condition2));// &&-Both condition true then result is true or else false
        System.out.println("Result is " +(condition1||condition2));
        System.out.println("Result is " +(!condition1));
        System.out.println("Result is " + (!condition2));


    }
}
