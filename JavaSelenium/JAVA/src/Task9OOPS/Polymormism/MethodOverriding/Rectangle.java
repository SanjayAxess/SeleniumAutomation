package Task9OOPS.Polymormism.MethodOverriding;

public class Rectangle extends Shape {
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
    public static void main(String[] args) {
        Shape s1=new Shape();
        s1.draw();
        Shape s2=new Circle();
        s2.draw();
        Shape s3=new Rectangle();
        s3.draw();
    }
}


