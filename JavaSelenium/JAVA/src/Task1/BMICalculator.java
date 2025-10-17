package Task1;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double weight,height,BMI;
        System.out.println("Enter the weight in Kilo-Grams");
        weight=scanner.nextDouble();
        System.out.println("Enter the height in meters");
        height=scanner.nextDouble();
        BMI=(weight)/(height*height);
        System.out.println("The BMI of person is :"+BMI);
    }
}
