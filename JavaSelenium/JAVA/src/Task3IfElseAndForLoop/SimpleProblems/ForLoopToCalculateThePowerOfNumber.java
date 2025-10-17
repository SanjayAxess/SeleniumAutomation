package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class ForLoopToCalculateThePowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the base number :");
        int base=scanner.nextInt();
        System.out.println("Enter the exponent :");
        int exponent=scanner.nextInt();
        int result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }
        System.out.println(base+" is the power of "+exponent+" is "+result);
    }
}
