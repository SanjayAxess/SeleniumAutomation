package Task1;

import java.util.Scanner;

public class CelciusToFahrenheitConvert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double temparature;
        System.out.println("Enter the  temparature in celsius  :");
        temparature=scanner.nextDouble();
        double fahrenheit;
        fahrenheit=(temparature*9/5)+32;
        System.out.println("The temparature in Fahrenheit :"+fahrenheit);



    }
}
