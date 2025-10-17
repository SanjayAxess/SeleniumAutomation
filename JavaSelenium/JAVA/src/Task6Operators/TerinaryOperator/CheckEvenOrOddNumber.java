package Task6Operators.TerinaryOperator;

import java.util.Scanner;

public class CheckEvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        //method-1
        String number=(num%2==0)?(" Number is Even"):(" Number is Odd");
        System.out.println(num+number);
        //method-2
        System.out.println((num%2==0)?(num+" Number is Even"):(num+" Number is Odd"));

    }



}
