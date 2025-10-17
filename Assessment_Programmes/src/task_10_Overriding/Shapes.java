package task_10_Overriding;

//Base Shapes class
class Shape {
 public void draw() {
     System.out.println("Drawing a generic shape");
 }
}

//Circle subclass
class Circle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a circle");
 }
}

//Rectangle subclass
class Rectangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a rectangle");
 }
}

//Triangle subclass
class Triangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a triangle");
 }
}

//Test the classes
public class Shapes {
 public static void main(String[] args) {
     Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};
     
     for (Shape shape : shapes) {
         shape.draw();
     }
 }
}

