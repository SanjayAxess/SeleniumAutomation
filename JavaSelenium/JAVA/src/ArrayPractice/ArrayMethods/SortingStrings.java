package ArrayPractice.ArrayMethods;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char a[]={'a','A','C','Z','c','z'};
        System.out.println("Before Sorting : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting : "+Arrays.toString(a));

        String b[]={"Hussain","Mohan","Hari","Harii","Haari","Haa","ha"};
        System.out.println("Before Sorting : "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("After Sorting : "+Arrays.toString(b));




    }
}
