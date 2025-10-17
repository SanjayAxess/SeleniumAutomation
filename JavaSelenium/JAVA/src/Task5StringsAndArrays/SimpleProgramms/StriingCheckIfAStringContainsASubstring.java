package Task5StringsAndArrays.SimpleProgramms;

import java.util.Scanner;

public class StriingCheckIfAStringContainsASubstring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Main String : ");
        String Main= scanner.nextLine();
        System.out.println("Enter the Sub-String : ");
        String Sub=scanner.nextLine();
        if(Main.contains(Sub)){
            System.out.println("The Main String Contains Sub-String");
        }else{
            System.out.println("The Main String does not Contains Sub-String");
        }
    }
}
