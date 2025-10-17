package Task1;

import java.util.Scanner;

public class CheckAYearIsLeepYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("Enter the year:");
        year=scanner.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+"is leap year");
        }else{
            System.out.println(year+"is not a lear year");
        }
    }
}
