package Task5StringsAndArrays.MediumLevelProgramms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMergeTwoArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of first array : ");
        int size1= scanner.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter "+size1+" the elements in first array : ");
        for(int i=0;i<size1;i++){
            arr1[i]= scanner.nextInt();
        }
        //System.out.println("The elemnets in first array is "+ Arrays.toString(arr1));
        System.out.println("Enter the size of second array : ");
        int size2= scanner.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter "+size2+" the elements in first array : ");
        for(int i=0;i<size2;i++){
            arr2[i]= scanner.nextInt();
        }
        System.out.println("The elemnets in first array is "+ Arrays.toString(arr1));
        System.out.println("The elemnets in first array is "+ Arrays.toString(arr2));
        //merge arrays
        int mergedArrays[]=new int[size1+size2];
        for(int i=0;i<size1;i++){
            mergedArrays[i]=arr1[i];
        }
        for(int i=0;i<size2;i++){
            mergedArrays[size1+i]=arr2[i];
        }
        System.out.println("Merged Arrays are :"+ Arrays.toString(mergedArrays));

    }
}
