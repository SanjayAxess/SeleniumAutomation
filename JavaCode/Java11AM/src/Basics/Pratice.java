package Basics;

public class Pratice {
    int age = 26;
    double height = 153.55;
    char initial = 'S';
    boolean name = true;


    public void getdetails(){
        String result = "Age: " + age + " Height: " + height + " initial: " + initial + " name: " + name;
        System.out.println(result);
    }
    public void swap(int a, int b){
        System.out.println("Before Swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public void circle(double radius){
        double circles = Math.PI * radius * radius;
        System.out.println("Area of the Circle is: " + circles);
    }

    public void simpleInterest(double principal, double rate, double time){
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: $" + interest);
    }

    public void Farenheits(double celsius){
        double Farenheit = (celsius * 9/5) + 32;
        System.out.println("Farenheit is:" + Farenheit);
    }

    public void sum(int a, int b){
        int sums = a + b;
        System.out.println("Sum is:" + sums);
    }

    public void product(double num1, double num2){
        double products = num1 * num2;
        System.out.println("Product is:" + products);
    }

    public static void main(String[] args) {
        Pratice p = new Pratice();
        //p.getdetails();
        //p.swap(20, 30);
        //p.circle(7.0);
        //p.simpleInterest(500.5, 6.5, 3);
        //p.Farenheits(40);
        //p.sum(10,20);
        p.product(12.5, 3.4);


    }
}
