package Task5StringsAndArrays.SimpleProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAnArrayInAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size(n) Elements in Array : ");
        int n= scanner.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter " +n+" Elements:");
        for(int i=0;i<n;i++){
            numbers[i]= scanner.nextInt();
        }
        System.out.println("The Elements Before sorting are : "+ Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("The Elements After sorting are : "+ Arrays.toString(numbers));

    }
}
