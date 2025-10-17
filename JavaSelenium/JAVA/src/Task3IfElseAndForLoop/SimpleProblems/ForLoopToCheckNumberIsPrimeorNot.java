package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class ForLoopToCheckNumberIsPrimeorNot {
    public static void main(String[] args) {
        Scanner scanne= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scanne.nextInt();
        int count=0;
        for(int i=1;i<=num;i++) {
            if(num % i == 0) {
                count++;
            }
        }if(count==2){
            System.out.println(num+" is the prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}
