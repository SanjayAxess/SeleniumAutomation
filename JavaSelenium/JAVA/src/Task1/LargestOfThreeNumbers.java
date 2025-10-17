package Task1;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num1,num2,num3,largest;
        System.out.println("Enter the 1st Number");
        num1=scanner.nextDouble();
        System.out.println("Enter the 2nd Number");
        num2=scanner.nextDouble();
        System.out.println("Enter the 3rd Number");
        num3=scanner.nextDouble();
        if (num1>num2 && num1>num3){
            System.out.println("The largest number is :"+(largest=num1));
        } else if (num2>num3 && num2>num1) {
            System.out.println("The largest number is :"+(largest=num2));
        } else{
            System.out.println("The largest number is :"+(largest=num3));
        }

        }

    }
