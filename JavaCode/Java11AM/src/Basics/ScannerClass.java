package Basics;

import java.util.Scanner;

public class ScannerClass {
    Scanner sc = new Scanner(System.in);//InputStream



    int a;
    int b;
    String message;

    public void multiply(){

        System.out.println("Enter Number 1: ");
        a = sc.nextInt();
        System.out.println("Enter Number 2: ");
        b = sc.nextInt();
        int c = a*b;
        System.out.println("Answer is: " +c);
    }

    public void strings(){
        System.out.println("Enter the words: ");
        message = sc.next();
        System.out.println(message);
    }

    public static void main(String[] args) {
        ScannerClass scs = new ScannerClass();
        scs.multiply();
        scs.strings();
    }
}
