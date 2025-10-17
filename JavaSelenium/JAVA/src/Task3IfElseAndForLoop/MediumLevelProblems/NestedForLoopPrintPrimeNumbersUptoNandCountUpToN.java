package Task3IfElseAndForLoop.MediumLevelProblems;

import java.util.Scanner;

public class NestedForLoopPrintPrimeNumbersUptoNandCountUpToN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Value of N :");
        int n=scanner.nextInt();
        int countPrimes=0;
        for(int num=2;num<=n;num++)
        {
            int count=0;
            for(int i=1;i<=num;i++) {
                if(num%i==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.print(num + " ");
                countPrimes++;
            }
        }
        System.out.println("\nTotal prime number up to " + n + " is: " + countPrimes);

    }
}
