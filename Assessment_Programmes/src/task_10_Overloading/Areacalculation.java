package task_10_Overloading;

public class Areacalculation {

    // Area of circle: π * r^2
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of rectangle: length * width
    public double area(double length, double width) {
        return length * width;
    }

    // Area of triangle: 0.5 * base * height
    public double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
    	Areacalculation calc = new Areacalculation();

        System.out.println("Area of circle (radius 5): " + calc.area(5));
        System.out.println("Area of rectangle (4 x 6): " + calc.area(4, 6));
        System.out.println("Area of triangle (base 3, height 7): " + calc.area(3, 7, true));
    }
}

