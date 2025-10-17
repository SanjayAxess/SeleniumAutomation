package Switches;



import java.util.Scanner;

public class Week {
    Scanner sc = new Scanner(System.in);
    int day;

    public void Stich (){
        System.out.println("Enter the day :");
        day = sc.nextInt();
        switch(day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default :
                System.out.println("Invalid Day");
        }
    }

    public static void main(String[] args) {
        Week wk = new Week ();
        wk.Stich();
    }
}
