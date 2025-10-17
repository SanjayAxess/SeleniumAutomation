package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Scanner;

public class StringRemoveAllWhiteSpacesFromaString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String Input= scanner.nextLine();
        String NoSpaces=Input.replaceAll("\\s+", "");
        System.out.println("The String without white spaces is "+NoSpaces);
    }
}
