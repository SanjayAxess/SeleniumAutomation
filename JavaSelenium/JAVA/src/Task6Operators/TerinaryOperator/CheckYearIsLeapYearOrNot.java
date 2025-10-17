package Task6Operators.TerinaryOperator;

import java.util.Scanner;

public class CheckYearIsLeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=scanner.nextInt();
        String result=(year%4==0)?((year%100==0)?((year%400==0)?" A Leap year":" Not A Leap Year"):" Not A leap Year"):" Not A Leap year";
        System.out.println(year+result);
    }
}
