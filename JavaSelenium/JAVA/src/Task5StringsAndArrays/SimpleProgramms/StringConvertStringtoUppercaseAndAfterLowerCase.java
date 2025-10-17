package Task5StringsAndArrays.SimpleProgramms;

import java.util.Scanner;

public class StringConvertStringtoUppercaseAndAfterLowerCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String Input=scanner.nextLine();
        System.out.println("The Uppercase of String is :"+Input.toUpperCase());
        System.out.println("The Lowercase of String is :"+Input.toLowerCase());
    }
}
