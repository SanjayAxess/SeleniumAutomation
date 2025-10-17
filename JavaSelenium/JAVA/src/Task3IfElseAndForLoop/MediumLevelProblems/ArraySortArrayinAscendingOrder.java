package Task3IfElseAndForLoop.MediumLevelProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortArrayinAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Size of element : ");
        int size= scanner.nextInt();
        int array[]=new int[size];

        System.out.println("Enter " +size+" Elements in array :");
        for(int i=0;i<size;i++){
            array[i]= scanner.nextInt();
        }
        //System.out.println("The Elements inArray before Sorting : "+ Arrays.toString(array));

        //Selection Sort using for loops

        for(int i=0;i<size-1;i++){
            int minIndex=i;

            //Find the index of the smallest element in the remaining array
            for(int j=i+1;j<size;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }

            //Swap the found minimum with the current element

            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;


            }
        //Display sorted array
        System.out.println("The Elements in array after Sorting : ");
        for(int i=0;i<size;i++){

            System.out.print(array[i]+" ");
        }


    }
}
