package Task4SwitchAndBreak.MediumLevelProblems;

import java.util.Scanner;

public class DayToActivityPlanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("The coresspoing numbers represends the day of week ");
        System.out.println("1 = Monday");
        System.out.println("2 = Tuesday");
        System.out.println("3 = Wednesday");
        System.out.println("4 = Thursday");
        System.out.println("5 = Friay");
        System.out.println("6 = Saturday");
        System.out.println("7 = Sunday");
        System.out.println("Enter the day number from 1 to 7 :");
        int day= scanner.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday : Start bhe new Sprint");
                break;
            case 2:
                System.out.println("Tuesday : Track the Health Activities");
                break;
            case 3:
                System.out.println("Wednesday : Grocery Shopping");
                break;
            case 4:
                System.out.println("Thursday : Ironing the office wear");
                break;
            case 5:
                System.out.println("Friday : Finish the pending sprint");
                break;
            case 6:
                System.out.println("Saturday : Movie-Time");
                break;
            case 7:
                System.out.println("Sunday : Rest and make Refresh the Mind");
                break;
            default:
                System.out.println("Invalid day!Please,Enter the number between 1 to 7 .");
        }
    }
}
