package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Scanner;

public class StringFirstNonRepeatedCharacterInAString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input=scanner.nextLine();

        //Convert to lowercase for uniformity
        input=input.toLowerCase();
        boolean found=false;

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(input.indexOf(ch)==input.lastIndexOf(ch)){
                System.out.println("First non Repeated Character in String : "+ch);
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("No non-Repeated Character in String");
        }

    }
}
