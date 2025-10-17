package Task7Methods;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        int result=1;
        for(int i=1;i<=num;i++){
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number= scanner.nextInt();

        int result=factorial(number);
        System.out.println("Factorial of "+number+" is "+result);
    }
}
