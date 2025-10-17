package Task5StringsAndArrays.SimpleProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCheckIfAnArrayContainsASpecificValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size(n) Elements in Array : ");
        int n= scanner.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter "+n+" Elements:");
        for(int i=0;i<n;i++){
            numbers[i]= scanner.nextInt();
        }
        System.out.println("The Elements are : "+ Arrays.toString(numbers));
        System.out.println("Enter the value to search for : ");
        int Specific_value=scanner.nextInt();
        boolean found=false;//false-not present   true=true
        for(int i=0;i<n;i++){
            if(numbers[i]==Specific_value){
                System.out.println("The value " + Specific_value + " is present in the array.");
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("The value " + Specific_value + " is not present in the array.");
        }
    }
}

