package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Scanner;

public class StringCountVowelsAndConsonets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String string= scanner.nextLine();
        string=string.toLowerCase();
        int vowel=0,consonent=0;
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(Character.isLetter(ch))//  Character.isLetter is specified whereter the chareter is letter or not
            {
                if( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }else{
                    consonent++;
                }

            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonent);

    }
}
