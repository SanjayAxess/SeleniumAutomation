package Task3IfElseAndForLoop.MediumLevelProblems;

import java.util.Scanner;

public class ForLoopCheckForPerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");//7--7%1--0+1--
        int num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }if(sum==num){
            System.out.println(num+" is the perfect number");
        }else{
            System.out.println(num+" is the perfect number");
        }
    }
}
