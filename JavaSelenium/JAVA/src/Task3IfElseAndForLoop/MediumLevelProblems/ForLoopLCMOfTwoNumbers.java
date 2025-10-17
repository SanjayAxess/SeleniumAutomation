package Task3IfElseAndForLoop.MediumLevelProblems;

import java.util.Scanner;

public class ForLoopLCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the fisrt number : ");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2=scanner.nextInt();
        int lcm;
        for(lcm = Math.max(num1,num2); ;lcm++){
            if(lcm%num1==0 && lcm%num2==0){
                break;
            }
        }
        System.out.println("The lcm for the "+num1+" and "+num2+" is "+lcm);
    }
}
