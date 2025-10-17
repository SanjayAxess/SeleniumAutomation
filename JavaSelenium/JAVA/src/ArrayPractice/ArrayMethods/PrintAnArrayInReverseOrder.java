package ArrayPractice.ArrayMethods;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAnArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[]={100,200,300,400,500};
        System.out.println("Elements in Array : "+ Arrays.toString(a));
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }


    }
}
