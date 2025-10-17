package Task3IfElseAndForLoop.MediumLevelProblems;

import java.util.Scanner;

public class ForLoopPrintArmstrongNumbersUpToN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the upper limit(n) : ");
        int n=scanner.nextInt();

        System.out.println("Armstrong Numbers up to "+n+" are : ");

        //Loop through all numbers from 1 to N

        for(int i=0;i<=n;i++){
            int sum=0;
            int temp=i;

            //Find the number of digits
            int digits=String.valueOf(i).length();


            //Calculate sum of each digit raised to the power of digits

            while(temp>0){
                int digit=temp%10;
                sum+=Math.pow(digit,digits);
                temp/=10;
            }
            // Check if sum equals the original number
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
