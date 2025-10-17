package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToRotate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of Elements in Array : ");
        int size= scanner.nextInt();

        int array[]=new int[size];

        System.out.println("Enter "+size+" Elements ");
        for(int i=0;i<size;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("The Elements in the array are : "+ Arrays.toString(array));


    }
}
