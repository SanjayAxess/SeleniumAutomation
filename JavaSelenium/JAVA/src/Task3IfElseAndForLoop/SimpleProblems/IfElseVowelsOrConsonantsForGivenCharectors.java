package Task3IfElseAndForLoop.SimpleProblems;

import java.util.Scanner;

public class IfElseVowelsOrConsonantsForGivenCharectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter the Charecter:");
        ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                System.out.println("The Entered Character is Vowel");
            } else {
                System.out.println("The Entered Character is Consonent");
            }
        }
    }
}
