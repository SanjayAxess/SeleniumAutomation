package Task1;

import java.util.Scanner;

public class SumOfFirstnNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number(n):");
        int n=scanner.nextInt();
        int sum=n*(n+1)/2;
        System.out.println("sum of first"+n+"natural numbers is"+sum);

    }
}
