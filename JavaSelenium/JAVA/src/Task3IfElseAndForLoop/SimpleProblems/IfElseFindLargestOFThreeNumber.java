package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class IfElseFindLargestOFThreeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=scanner.nextInt();
        System.out.println("Enter the second number : ");
        int b=scanner.nextInt();
        System.out.println("Enter the Third number : ");
        int c=scanner.nextInt();
        if(a>b && a>c){
            System.out.println("\"" +a+ "\" is the largest number.");
        }else if(b>c && c>a){
            System.out.println("\"" +b+ "\" is the largest number.");
        }else{
            System.out.println("\"" +c+ "\" is the largest number.");
        }
    }
}
