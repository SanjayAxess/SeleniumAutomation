package Task4SwitchAndBreak.MediumLevelProblems;

import java.util.Scanner;

public class SimpleVendingMachine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the Vending Machine!");
        System.out.println("1. Chips");
        System.out.println("2. Soda");
        System.out.println("3. Candy");
        System.out.println("Enter the number between 1 to 3 : ");
        int choice= scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("You selected the Chips ");
                break;
            case 2:
                System.out.println("You selected the Soda ");
                break;
            case 3:
                System.out.println("You selected the Chips ");
                break;
            default:
                System.out.println("Invalid Number.Please,Enter the number between 1 to 3");

        }
    }
}
