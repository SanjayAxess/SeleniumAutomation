package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Scanner;

public class StringFindAllSubstringsOfAString {
    public static void main(String[] args) {
        Scanner scanenr=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input= scanenr.nextLine();
        //Generate and print all substrings
        System.out.println("All the sub-string \""+input+ "\": ");
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                String substring=input.substring(i,j);
                if(substring==input){
                    continue;
                }
                System.out.println(substring);
                //System.out.println(input.substring(i,j));

            }
        }


    }
}
