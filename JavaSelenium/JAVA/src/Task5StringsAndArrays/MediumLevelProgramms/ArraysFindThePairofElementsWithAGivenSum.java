package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindThePairofElementsWithAGivenSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elemnents in array : ");
        int size= scanner.nextInt();

        int array[]=new int[size];
        System.out.println("Enter "+size+" Elemnets : ");
        for(int i=0;i<size;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("The elements in the array is : "+ Arrays.toString(array));

        System.out.println("Enter the target sum : ");
        int target= scanner.nextInt();

        //Find and print all pairs
        System.out.println("Pairs with sum " + target + ":");

        boolean foundPair=false;
        for(int i=0;i<size-1;i++){
            for(int j=1+i;j<size;j++){
                if(array[i]+array[j]==target){
                    System.out.println(("("+array[i]+" , "+array[j]+")")+"==>"+(array[i]+" + "+array[j]+" = "+target));
                    //System.out.println(array[i]+" + "+array[j]+" = "+target);
                    foundPair=true;

                }
            }

        }
        if(!foundPair){
            System.out.println("No pairs  found with the given sum");
        }
    }
}
