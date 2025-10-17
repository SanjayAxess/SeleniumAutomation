package Task5StringsAndArrays.SimpleProgramms;

import java.util.Scanner;

public class StringConcatenateTwoStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String S1=scanner.nextLine();
        System.out.print("Enter the Second String : ");
        String S2=scanner.nextLine();
        System.out.println(S1+" ".concat(S2));

    }
}
