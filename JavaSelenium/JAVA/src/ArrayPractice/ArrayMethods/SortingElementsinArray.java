package ArrayPractice.ArrayMethods;

import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[]={100,600,212,400,115,299,300,500};
        System.out.println("Before Sorting :"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting :"+Arrays.toString(a));

    }
}
