package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class ForLoopSumeOfAllEvenNumberstoGivenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit number :");
        int limit=scanner.nextInt();
        int sum=0;
        for(int i=2;i<=limit;i+=2){
            sum+=i;
        }
        System.out.println("Sum of the even number up to "+limit+ " is "+sum);
    }
}
