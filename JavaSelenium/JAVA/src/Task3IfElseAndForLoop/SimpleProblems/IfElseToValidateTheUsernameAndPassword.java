package Task3IfElseAndForLoop.SimpleProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseToValidateTheUsernameAndPassword {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username="Axess123";
        String password="9876543210";
        System.out.println("Enter the Username :");
        String Enter_username=scanner.nextLine();
        System.out.println("Enter the Password :");
        String Enter_password=scanner.nextLine();
        if((username.equals(Enter_username))&&(password.equals(Enter_password))){
            System.out.println(Enter_username+" is Valid");
            System.out.println(Enter_password+ " is Valid");
            System.out.println("Login is Successful");
        }else{
            System.out.println("Login Failed.Invalid username & Password ");
            System.out.println("Please Enter Valid username and password");
        }
    }
}
