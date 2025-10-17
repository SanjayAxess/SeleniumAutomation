package Task1;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10,b=20;
        int c;
        System.out.println("The number before swaping ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        /*c=b-a;
        //System.out.println(c);
        b=+c;
        //System.out.println(b);
        a=c+b;
        //System.out.println(a);
        System.out.println("The number After swaping ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);*/
        //Another method
        c=(a*b);
        a=c/a;
        b=c/b;
        System.out.println("The number After swaping ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);



    }
}
