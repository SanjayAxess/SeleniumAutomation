package task11_Abstract;

//Abstract class
abstract class Shape45 {
 // Abstract method
 abstract void calculateArea();
}

//Subclass Circle
class Circle extends Shape45 {
 double radius;

 // Constructor
 Circle(double radius) {
     this.radius = radius;
 }

 // Implement abstract method
 @Override
 void calculateArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + area);
 }
}

//Subclass Square
class Square extends Shape45 {
 double side;

 // Constructor
 Square(double side) {
     this.side = side;
 }

 // Implement abstract method
 @Override
 void calculateArea() {
     double area = side * side;
     System.out.println("Area of Square: " + area);
 }
}

//Main class to test
public class Shapeabs {
 public static void main(String[] args) {
	 Shape45 circle = new Circle(5);
	 Shape45 square = new Square(4);

     circle.calculateArea();
     square.calculateArea();
 }
}

