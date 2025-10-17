package Task1;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total_bill;
        System.out.println("Enter the total bill:");
        total_bill=scanner.nextInt();
        double tip_percentage;
        System.out.println("Enter the tip_percentage:");
        tip_percentage=scanner.nextDouble();
        double tip_amount=total_bill*tip_percentage/100;
        System.out.println("The tip amount is :\u20B9"+tip_amount);



    }
}
