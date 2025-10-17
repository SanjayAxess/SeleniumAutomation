package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class IfElseCheckDivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long  num;
        System.out.println("Enter the number : ");
        num=scanner.nextLong();
        if(num%5==0){
            System.out.println(num+" is divisble by 5");
        }else{
            System.out.println(num+ " is not divisble by 5");
        }
    }
}
