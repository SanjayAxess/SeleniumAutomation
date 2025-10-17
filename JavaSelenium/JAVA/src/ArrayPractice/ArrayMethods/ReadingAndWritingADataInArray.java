package ArrayPractice.ArrayMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingADataInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter the Element for the index position "+i+ " : ");
            a[i]= scanner.nextInt();
        }
        System.out.println("Printing "+a.length+" Array elements : "+Arrays.toString(a));
        //System.out.println(Arrays.toString(a));

    }
}
