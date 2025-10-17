package Task3IfElseAndForLoop.MediumLevelProblems;

import java.util.Scanner;

public class ArrayFindSecondLargestElementinAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the  size of elements in Array : ");
        int size= scanner.nextInt();

        if(size<2){
            System.out.println("Array must contain alteast 2 elements : ");
            return;
        }
         int array[]=new int[size];
        System.out.println("Enter the Elemnets in array :");
        for(int i=0;i<size;i++){
            array[i]= scanner.nextInt();
        }
        int  n=array[0];
        for(int i=1;i<size;i++){
            //int m=0;
            if(array[i]>n){
                n=array[i];
            }
        }
        System.out.println("\""+n+"\"is the largest number ");

        int m=array[0];
        for(int i=0;i<size;i++){
            if(array[i]!=n&&array[i]>m){
                m=array[i];
            }
        }
        System.out.println("\""+m+"\" is the second largest number ");

    }
}
