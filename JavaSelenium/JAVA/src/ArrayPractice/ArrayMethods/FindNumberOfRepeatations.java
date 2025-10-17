package ArrayPractice.ArrayMethods;

import java.util.Scanner;

public class FindNumberOfRepeatations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a[]={ 100,200,100,300,100,400,100,500,100,200,200,400,300,500,600};
        System.out.print("Enter the number : ");
        int num= scanner.nextInt();
        int count=0;
        for(int value:a)
        {
         if(value==num)
         {
             count++;
         }
        }if(count==1 ||count ==0)
        {
        System.out.println(num+" is repeated for "+count+" time");
        }else
        {
            System.out.println(num+" is repeated for "+count+" times");
        }

    }
}
