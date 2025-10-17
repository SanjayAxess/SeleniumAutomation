package Task7Methods;

import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number= scanner.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is Prime Number ");
        }else{
            System.out.println(number+" is not Prime Number");
        }

    }
}
