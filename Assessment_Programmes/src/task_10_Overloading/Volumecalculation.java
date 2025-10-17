package task_10_Overloading;

public class Volumecalculation {

    // Volume of a cube: side^3
    public static double volume(double side) {
        return Math.pow(side, 3);
    }

    // Volume of a rectangular prism: length * width * height
    public static double volume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of a sphere: (4/3) * π * radius^3
    public static double volume(double radius, boolean isSphere) {
        if (isSphere) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Cube volume (side=3): " + volume(3));
        System.out.println("Rectangular Prism volume (2,3,4): " + volume(2, 3, 4));
        System.out.println("Sphere volume (radius=3): " + volume(3, true));
    }
}
