package Task7Methods;

import java.util.Scanner;

public class Sum {
    public void calculateSum(int a,int b){
        System.out.print("Sum Of two Numbers : "+(a+b));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the First Number :");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Number :");
        int num2 = scanner.nextInt();
        Sum result=new Sum();
        result.calculateSum(num1,num2);
    }
}
