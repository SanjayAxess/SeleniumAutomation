package Looping;

import java.util.Scanner;

public class Iterator {
    //int count;
    Scanner sc = new Scanner(System.in);
    boolean loginstatus = false;
    String uname;
    String pass;

    //public void aLoop(int count) {
//        this.count = count;
//        while (count < 5) {
//            System.out.println("Counts : " +count);
//            count++;
//        }
//    }

    public void login(){
        do {
            System.out.println("Enter the username :");
            uname = sc.next();
            System.out.println("Enter the password :");
            pass = sc.next();

            if (uname.equals("admin") && pass.equals("pass123")){
                System.out.println("Login Succesful");
                loginstatus = true;
            }
            else {
                System.out.println("Invalid");
                loginstatus = false;

            }
        }while (loginstatus == true);
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Iterator to = new Iterator();
        //to.aLoop(1);
        to.login();
    }
}
