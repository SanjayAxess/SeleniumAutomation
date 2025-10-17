package Task7Methods;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int originalNum=num;
        int reversedNum=0;
        while(num!=0){
            int digit=num%10; //get last digit
            reversedNum=reversedNum*10+digit; //append digit
            num/=10;  //remove last digit
        }
        if (originalNum == reversedNum) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number= scanner.nextInt();
        if(isPalindrome(number)){
            System.out.println(number +" is Palindrome");
        }else {
            System.out.println(number+" is not a Palindrome");
        }
    }

}
