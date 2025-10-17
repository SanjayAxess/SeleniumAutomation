package task_9;

//Base class
class Shape1 {
 void draw1() {
     System.out.println("Drawing Shapes");
 }
}

//Subclass Circle overriding draw()
class Circle extends Shape1 {
 @Override
 void draw1() {
     System.out.println("Drawing Circle");
 }
}

//Subclass Rectangle overriding draw()
class Rectangle extends Shape1 {
 @Override
 void draw1() {
     System.out.println("Drawing Rectangle");
 }


//Main class to demonstrate method overriding and polymorphism

 public static void main(String[] args) {
     // Creating objects of Shapes, Circle, and Rectangle
     Shape1 shape = new Shape1();
     Shape1 circle = new Circle();       // Polymorphism: Shapes reference, Circle object
     Shape1 rectangle = new Rectangle(); // Polymorphism: Shapes reference, Rectangle object

     // Calling draw() method on each object
     shape.draw1();       // Output: Drawing Shapes
     circle.draw1();      // Output: Drawing Circle
     rectangle.draw1();   // Output: Drawing Rectangle
 }
}