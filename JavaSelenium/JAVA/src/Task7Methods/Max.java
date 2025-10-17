package Task7Methods;

import java.util.Scanner;

public class Max {
    public static double findMax(double a,double b){
        double result;
        result = (a > b) ? a : b;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        double num1= scanner.nextDouble();
        System.out.println("Enter the second Number : ");
        double num2= scanner.nextDouble();

        //Call the method
        double max=findMax(num1,num2);
        System.out.println("The Maximum number between"+num1+" and "+num2+" is "+max);

//        Max max=new Max();
//        max.findMax(num1,num2);
//        System.out.println("The Maximum Number Between "+num1+" and "+num2+" is ");

    }
}
