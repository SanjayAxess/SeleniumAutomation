package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindTheIntersectionofTwoArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of elements(size1) in First Array : ");
        int size1= scanner.nextInt();

        int array1[]=new int[size1];
        System.out.println("Enter the "+size1+" Elements in First Array :");
        for(int i=0;i<size1;i++){
            array1[i]= scanner.nextInt();
        }
        System.out.println("Enter the number of elements(size2) in Second Array : ");
        int size2= scanner.nextInt();

        int array2[]=new int[size2];
        System.out.println("Enter the "+size2+" Elements in Second Array :");
        for(int i=0;i<size1;i++){
            array2[i]= scanner.nextInt();
        }
        System.out.println("The Eelments in the First Array is "+ Arrays.toString(array1));
        System.out.println("The Eelments in the Second Array is "+ Arrays.toString(array2));

        System.out.println("Common Elements Between Two Arrays are : ");
        boolean foundCommon=false;
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if (array1[i]==array2[j]) {
                    System.out.println(array1[i]+" ");
                    foundCommon=true;
                    break; //avoid printing duplicates if repeating in 2nd array
                }
            }
        }
        if(!foundCommon){
            System.out.println("No Common Elements Found");
        }


    }
}
