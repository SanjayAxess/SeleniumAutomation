package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Arrays;
import java.util.Scanner;

public class StringCheckIfTwoStringsAreAnagrams {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String str1=scanner.nextLine();
        System.out.println("Enter the Second String : ");
        String str2=scanner.nextLine();

        //Clean and normalize strings
        str1=str1.replaceAll("\\s+","").toLowerCase();
        str2=str2.replaceAll("\\s+","").toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("The Strings are not AnaGram.");
        }else{
            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println("The Strings are Anagrams");
            }else{
                System.out.println("The Strings are not Anagrams");
            }

        }

    }
}
