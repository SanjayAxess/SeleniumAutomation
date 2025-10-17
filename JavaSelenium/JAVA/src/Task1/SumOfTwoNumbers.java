package Task1;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int First_Number,Second_Number,sum;
        System.out.println("Enter the First number:");
        First_Number =scanner.nextInt();
        System.out.println("Enter the Second_Numbers:");
        Second_Number =scanner.nextInt();
        sum=First_Number+Second_Number;
        System.out.println("The sum of Two Numbers is :" +sum);



    }
}
