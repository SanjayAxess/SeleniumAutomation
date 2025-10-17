package Task5StringsAndArrays.SimpleProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindTheMaximumElementInAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the n Elements in Array : ");
        int n= scanner.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter "+n+" Elements:");
        for(int i=0;i<n;i++){
            numbers[i]= scanner.nextInt();
        }
        System.out.println("The Elements are : "+ Arrays.toString(numbers));
        int maximum=numbers[0];
        for(int i=1;i<n;i++){
            if(numbers[i]>maximum){
                maximum=numbers[i];
            }
        }
        System.out.println("The Maximum Element in Array "+ Arrays.toString(numbers)+" is "+maximum);
    }
}
