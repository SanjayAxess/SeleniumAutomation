package Task1;

import java.util.Scanner;

public class VariableDatatype {


    public static void main(String[] args) {
        int a=100;
        double b=200;
        int c=150;
        int temp;
        char ch='S';
        String st="Names";
        System.out.println("A values is:"+a);
        System.out.println("B value:"+b);
        System.out.println("Char is:"+ch);
        System.out.println("String is:"+st);
        temp=a;
        a=c;
        c=temp;
        System.out.println("Swapping Numbers");
        System.out.println("A values is:"+a);
        System.out.println("C values is:"+c);
        System.out.println("-----------");
        double pi=3.14;
        float r=4;
        double x=pi*(r*r);
        System.out.println("Area of circle is:" +x);
        double rate=0.05;
        double time=3;
        double amount=1000;
        double inters=amount*(rate*time);
        System.out.println("Simple interest is:"+inters);
        double faren;
        double celci=38;
        faren=(celci*9/5)+32;
        System.out.println("The temperature is Fahrenheit is:"+faren);
        int sum=a+c;
        System.out.println("Sum of 2 integers "+sum);
        double prod=inters*faren;
        System.out.println("Product of 2 double value is:"+prod);
        int arearect=a*c;
        System.out.println("Area of rectangle is:" +arearect);
        double perimeter=4*b;
        System.out.println("perimeter of Square is:" +perimeter);
        double bmi;
        double height;
        double weight;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values of Height");
        height=sc.nextDouble();
        System.out.println("Enter the Values of weight");
        weight=sc.nextDouble();
        bmi=weight/(height*height);
        System.out.println(" the Values of BMI is:"+bmi);
        }
}
