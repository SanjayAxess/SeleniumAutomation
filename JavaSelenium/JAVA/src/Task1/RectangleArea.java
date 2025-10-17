package Task1;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double length,breath,area;
        System.out.println("Enter the lenght of rectangle :");
        length=scanner.nextDouble();
        System.out.println("Enter the breath of rectangle:");
        breath=scanner.nextDouble();
        area=length*breath;
        System.out.println("Area of the Rectangle in square units :"+area);
    }
}
