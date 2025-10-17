package Task4SwitchAndBreak.SimpleLevelProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the colour(Red,Yellow,Green) : ");
        String colour=scanner.nextLine();
        switch(colour){
            case "Red" :
                System.out.println("STOP !");
                break;
            case "Yellow" :
                System.out.println("WAIT....");
                break;
            case "Green" :
                System.out.println("LET's Go...");
                break;
            default :
                System.out.println("Enter the valid Colour.");
        }

    }
}
