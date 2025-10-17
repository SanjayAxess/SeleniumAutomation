package Task5StringsAndArrays.SimpleProgramms;

import java.util.Scanner;

public class StringCheckIfAStringIsEmpty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=scanner.nextLine();
        String trimmedstr=str.trim();
        if(trimmedstr.isEmpty()){
            System.out.println("The String is Empty");
        }else{
            System.out.println("The String is Not Empty");
        }

    }
}
