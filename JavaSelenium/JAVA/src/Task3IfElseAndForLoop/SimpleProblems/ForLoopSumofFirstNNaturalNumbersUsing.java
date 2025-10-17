package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class ForLoopSumofFirstNNaturalNumbersUsing {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number(n):");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("The sum of First "+n+" Natural Numbers is "+sum);
    }
}
