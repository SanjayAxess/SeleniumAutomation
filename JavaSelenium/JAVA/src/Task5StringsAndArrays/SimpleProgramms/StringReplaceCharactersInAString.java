package Task5StringsAndArrays.SimpleProgramms;

import java.util.Scanner;

public class StringReplaceCharactersInAString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string=scanner.nextLine();
        System.out.println("Enter the Charecter to Replace : ");
        char replace_old=scanner.next().charAt(0);
        System.out.println("Enter the New Charecter : ");
        char new_charecter=scanner.next().charAt(0);
        System.out.println("The String with Replaced charecter is "+string.replace(replace_old,new_charecter));

    }
}
