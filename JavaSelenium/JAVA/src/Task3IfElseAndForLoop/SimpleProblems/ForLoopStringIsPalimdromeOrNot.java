package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class ForLoopStringIsPalimdromeOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String :");
        String input=scanner.nextLine();
        boolean isPalindrome=true;
        int length=input.length();
        for(int i=0;i<length/2;i++){
            if(input.charAt(i)!=input.charAt(length-1-i)){
                isPalindrome=false;
                break;
            }
        }if(isPalindrome) {
            System.out.println( "\""+input + "\" is a palindrome.");
        } else {
            System.out.println("\""+input + "\" is not a palindrome.");
        }
    }
}
