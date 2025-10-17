package Task11Interface.DrawbleInterface;

//Objective: Create an interface called Drawable with a method draw(). Then, create two classes Circle
//and Rectangle that implement the Drawable interface and provide implementations for the draw()
//method

public interface Drawble {
    void method();
}

class Circle implements Drawble{
   // @Override
    public void method() {
        System.out.println("Drawing the Circle");
    }
}

class Rectangle extends Circle implements Drawble{
    public void method() {
        System.out.println("Drawing the Rectangle");
    }

    public static void main(String[] args) {
//        Drawble drawCricle=new Circle();
//        drawCricle.method();
//        Drawble drawRectangle=new Rectangle();
//        drawRectangle.method();

        //2nd method
        Circle drawC=new Circle();
        drawC.method();
        Rectangle drawR=new Rectangle();
        drawR.method();



    }

}