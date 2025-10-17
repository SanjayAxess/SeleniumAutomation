package Task1;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double square_side;
        System.out.println("Enter the side-length:");
        square_side=scanner.nextDouble();
        double perimeter=4*square_side;
        System.out.println("The perimeter of a square in units:" +perimeter);

    }
}
