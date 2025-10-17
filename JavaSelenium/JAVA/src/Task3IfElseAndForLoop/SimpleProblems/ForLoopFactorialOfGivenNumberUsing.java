package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class ForLoopFactorialOfGivenNumberUsing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=scanner.nextInt();
        long factorial=1;
        for(int i=1;i<=num;i++){
            factorial *= i;
            //System.out.println("The factorial for the number "+num+" is "+factorial);
        }
        System.out.println("The factorial for the number "+num+" is "+factorial);

    }
}
