package Task1;

import java.util.Scanner;

public class ConvertMetersToKiloMeters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double meters,kilometers;
        System.out.println("Enter the distance in meters:");
        meters=scanner.nextDouble();
        kilometers=meters/=1000;
        System.out.println("Then distance in kilomerters is :" +kilometers);

    }
}
