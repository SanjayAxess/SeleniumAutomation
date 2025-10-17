package Task7Methods;

import java.util.Scanner;

public class EvenOrOdd {

    public static void checkEvenOdd(int number){
        if(number%2==0){
            System.out.println(number+ " is Even Number");
        }else{
            System.out.println(number+" is Odd Number");;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number= scanner.nextInt();
        //Approch1
       checkEvenOdd(number);
             // or
        //Approch2
        EvenOrOdd.checkEvenOdd(number);


    }
}
