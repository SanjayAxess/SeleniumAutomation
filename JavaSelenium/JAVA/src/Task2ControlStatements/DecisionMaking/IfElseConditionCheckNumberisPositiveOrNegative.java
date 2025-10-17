package Task2ControlStatements.DecisionMaking;

import java.util.Scanner;

public class IfElseConditionCheckNumberisPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num;
        System.out.println("Enter the number:");
        num=scanner.nextDouble();
       /* if(num>0){
            System.out.println(num+" is Positive Number");
        }else  {
            System.out.println(num+" is Negative Number");
        }*/
        //String number=(num>0)?(num+" is Positive Number"):(num+" is Negative Number");
        //System.out.println(number);
        System.out.println((num>0)?(num+" is Positive Number"):(num+" is Negative Number"));

    }

}
