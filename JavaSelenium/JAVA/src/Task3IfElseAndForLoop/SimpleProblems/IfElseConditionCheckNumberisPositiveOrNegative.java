package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class IfElseConditionCheckNumberisPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num;
        System.out.println("Enter the number:");
        num=scanner.nextDouble();
       if(num>0){
            System.out.println(num+" is Positive Number");
        }else  {
            System.out.println(num+" is Negative Number");
        }
    }

}
