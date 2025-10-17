package Task4SwitchAndBreak.MediumLevelProblems;

import java.util.Scanner;

public class MonthNumberToDaysConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 12 : ");
        int month= scanner.nextInt();
        switch(month){
            case 1:
                System.out.println("January month has 31 days");
            case 2:
                System.out.println("Febraury month has 28 days");
                break;
            case 3:
                System.out.println("March month has 31 days");
                break;
            case 4:
                System.out.println("April month has 30 days");
                break;
            case 5:
                System.out.println("May month has 31 days");
                break;
            case 6:
                System.out.println("June month has 30 days");
                break;
            case 7:
                System.out.println("July month has 31 days");
                break;
            case 8:
                System.out.println("August month has 31 days");
                break;
            case 9:
                System.out.println("September month has 3o days");
                break;
            case 10:
                System.out.println("October month has 31 days");
                break;
            case 11:
                System.out.println("November month has 30 days");
                break;
            case 12:
                System.out.println("December month has 31 days");
                break;
            default:
                System.out.println("Invalid Month!.Please Enter the number from 1 to 12. ");
        }
    }
}
