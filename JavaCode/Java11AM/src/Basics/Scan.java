package Basics;

public class Scan {
    int a;
    int b;

    public void addition(int num1, int num2){
        this.a = num1;
        this.b = num2;
        int c = num1+num2;
        System.out.println("Addition "  +c);

    }
    public void sub(int a, int b){
        this.a = a;
        this.b = b;
        int c = a-b;
        System.out.println("Subract " +c);
    }

    public static void main(String[] args) {
        Scan s = new Scan();
        s.addition(50, 50);
        s.sub(30, 20);
    }
}
