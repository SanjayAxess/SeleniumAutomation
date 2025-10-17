package Task1;

import java.util.Scanner;

public class ConvertOneCurrencyToAnotherCurrency {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //convert from USD to INR
        double usdAmount;
        System.out.println("Enter the Amount in USD:");
        usdAmount=scanner.nextDouble();
        double conversion= 86.32;  //present 1USD=86.32Rupees
        double indianAmount=conversion*usdAmount;
        System.out.println("The Amount in INR:\u20B9" +indianAmount);
        //System.out.println("The price is \u20B9100.");
    }
}
