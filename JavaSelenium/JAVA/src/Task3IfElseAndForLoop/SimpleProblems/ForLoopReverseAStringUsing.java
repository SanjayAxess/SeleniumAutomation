package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class ForLoopReverseAStringUsing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Original String: ");
        String Original=scanner.nextLine();
        String reverse=" ";
        for(int i=Original.length()-1;i>=0;i--) {
            reverse += Original.charAt(i);
        }
        System.out.println("Original String is : "+Original);
        System.out.println("Reversed String is : "+reverse);
        // for extra practice i want to print the string in reverse that too lower case & Upper case also
        String Lower_case=reverse.toLowerCase();
        System.out.println("Reversed String in Lowered Case is "+Lower_case);
        String Upper_case=reverse.toUpperCase();
        System.out.println("Reversed String in Lowered Case is "+Upper_case);




    }
}
