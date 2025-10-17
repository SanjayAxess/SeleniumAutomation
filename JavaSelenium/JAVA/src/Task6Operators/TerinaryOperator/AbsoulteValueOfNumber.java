package Task6Operators.TerinaryOperator;

import java.util.Scanner;

public class AbsoulteValueOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        int value =(num>0)?num:-num;
        System.out.println("The absolute value of "+num+" is "+value);




    }
}
