package Task6Operators.TerinaryOperator;

import java.util.Scanner;

public class CheckIfaNumberisPositiveorNegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        double num=scanner.nextDouble();
        String number=(num>0)?(num+" is postive number"):((num<0)?(num+" is negative number"):(num+ "is zero"));
        System.out.println(number);

    }
}
