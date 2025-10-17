package Task1;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num= scanner.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
