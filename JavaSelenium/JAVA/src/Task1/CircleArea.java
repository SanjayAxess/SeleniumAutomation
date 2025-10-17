package Task1;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        /*int radius=10;
        double area= Math.PI*radius*radius;
        System.out.println("The area of circle is:"+area);
        System.out.printf("Area of the circle: %.2f square units%n", area);*/
        Scanner sc= new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius:");
         radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.printf("Area of the circle: %.2f square units%n", area);



    }
}
