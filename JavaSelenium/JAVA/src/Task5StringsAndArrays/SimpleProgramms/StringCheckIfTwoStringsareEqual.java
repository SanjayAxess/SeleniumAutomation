package Task5StringsAndArrays.SimpleProgramms;

import java.util.Scanner;

public class StringCheckIfTwoStringsareEqual {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String S1=scanner.nextLine();
        System.out.print("Enter the Second String : ");
        String S2=scanner.nextLine();
        if(S1.equals(S2)){
            System.out.println("The Strings are Equal");
        }else{
            System.out.println("The String are not equal");
        }
    }
}
