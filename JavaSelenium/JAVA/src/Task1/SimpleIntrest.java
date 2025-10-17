package Task1;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principle_amount;
        System.out.println("Enter the Principle Amount in Rupees:");
        principle_amount =scanner.nextInt();
        int time;
        System.out.println("Enter the time in Years:");
        time =scanner.nextInt();
        double rate;
        System.out.println("Enter the time in Annual Rate of Intrest in Percentage:");
        rate=scanner.nextDouble();
        double intrest=(principle_amount*time*rate)/100;
        System.out.println("The Simple Intrest in Rupees is " +intrest);





    }
}
