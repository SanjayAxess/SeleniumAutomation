package Task2ControlStatements.DecisionMaking;

import java.util.Scanner;

public class IfConditionCheckNumberisPositive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num;
        System.out.println("Enter the number:");
        num=scanner.nextDouble();
        if(num>0){
            System.out.println("The number is Positive");
        }
    }
}
