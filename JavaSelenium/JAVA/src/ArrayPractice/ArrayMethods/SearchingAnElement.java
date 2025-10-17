package ArrayPractice.ArrayMethods;

import java.util.Scanner;

public class SearchingAnElement {
    public static void main(String[] args) {
        //1.search an element in array(linear search)
        int a[]={10,20,30,40,50};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Element : ");
        int search_element= scanner.nextInt();
        boolean status=false; //false-not found    true-found
       /* for(int i=0;i<a.length;i++)
        {
            if(a[i]==search_element)
            {
                System.out.println("Element Found ");
                status=true;
                break;
            }
        }
        if(status==false)
        {
        System.out.println("Element "+search_element+ " is not found");
        }*/
        for(int x:a){
            if(x==search_element){
                System.out.println("Element "+search_element+" is Found ");
                status=true;
                break;
            }
        }
        if(status==false)
        {
        System.out.println("Element "+search_element+ " is not found");
        }
    }
}
