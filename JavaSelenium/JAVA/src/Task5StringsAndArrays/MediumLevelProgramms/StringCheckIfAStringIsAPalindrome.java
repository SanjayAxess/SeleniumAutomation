package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Scanner;

public class StringCheckIfAStringIsAPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input= scanner.nextLine();
        // Remove spaces and convert to lowercase
        String cleaned=input.replaceAll("\\s+", "").toLowerCase();
        String reversed="";
        for(int i=cleaned.length()-1;i>=0;i--){
            reversed+=cleaned.charAt(i);
        }
        if(cleaned.equals(reversed)){
            System.out.println("Entered String : "+input+" is Palindrome");
        }else{
            System.out.println("Entered String : "+input+" is not a Palindrome");

        }

    }
}
