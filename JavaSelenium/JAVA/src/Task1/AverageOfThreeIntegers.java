package Task1;

import java.util.Scanner;

public class AverageOfThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first_integer,second_integer,third_integer;

        System.out.println("Enter the Fisrt Integer:");
        first_integer=scanner.nextInt();
        System.out.println("Enter the Second Integer:");
        second_integer=scanner.nextInt();
        System.out.println("Enter the Third Integer:");
        third_integer=scanner.nextInt();
        float average=(first_integer+second_integer+third_integer)/3.0f;
        System.out.println("The average of three integers ="+average);

    }
}
