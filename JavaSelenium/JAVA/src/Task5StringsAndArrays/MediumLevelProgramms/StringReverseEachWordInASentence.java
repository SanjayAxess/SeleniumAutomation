package Task5StringsAndArrays.MediumLevelProgramms;

import java.util.Scanner;

public class StringReverseEachWordInASentence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String sentence=scanner.nextLine();

        //splint the sentence in tp words
        String words[]=sentence.split("\\s+");

        StringBuilder result=new StringBuilder();
        for(String word:words){
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse()).append(" ");
        }
        System.out.println("The Reversed word in sentence : "+ result.toString().trim());

    }
}
