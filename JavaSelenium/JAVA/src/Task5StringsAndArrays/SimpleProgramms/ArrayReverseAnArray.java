package Task5StringsAndArrays.SimpleProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter the Element for the index position "+i+ " : ");
            a[i]= scanner.nextInt();
        }
        System.out.println(" Array elements are "+Arrays.toString(a));
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }

    }
}
