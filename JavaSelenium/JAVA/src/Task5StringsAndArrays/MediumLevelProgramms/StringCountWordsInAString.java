package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Scanner;

public class StringCountWordsInAString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input= scanner.nextLine();
        String words[]=input.trim().split("\\s+");
        System.out.println("Number of words = "+words.length);

    }
}
