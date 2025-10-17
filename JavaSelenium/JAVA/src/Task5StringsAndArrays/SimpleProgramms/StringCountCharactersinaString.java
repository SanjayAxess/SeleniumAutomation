package Task5StringsAndArrays.SimpleProgramms;

import java.util.Scanner;

public class StringCountCharactersinaString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str= scanner.nextLine();
        //String str=" Hello World ";
        System.out.println("The total number of characters in a String is "+str.length());
    }
}
