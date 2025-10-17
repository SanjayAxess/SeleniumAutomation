package Task7Methods;

import java.util.Scanner;

public class CircleArea {
    public static double area(double radius){
        return 3.1416*radius*radius;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        double radius= scanner.nextDouble();
        double result=area(radius);
        System.out.println("Area of Circle : "+result);
    }
}
