package Task1;

import java.util.Scanner;

public class ProductOfTwoNumbersInFloat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float First_Number=106.75f,Second_Number=156.679f,product;
        System.out.println("the First number:" +First_Number);
        System.out.println("the Second_Numbers:"+Second_Number);
        product=First_Number*Second_Number;
        System.out.println("The product of Two Float Numbers is :" +product);
    }
}
