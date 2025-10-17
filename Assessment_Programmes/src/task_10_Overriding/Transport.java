package task_10_Overriding;

//Base class
class Vehicle {
 public void move() {
     System.out.println("The vehicle is moving.");
 }
}

//Car subclass
class Car extends Vehicle {
 @Override
 public void move() {
     System.out.println("The car is driving on the road.");
 }
}

//Bike subclass
class Bike extends Vehicle {
 @Override
 public void move() {
     System.out.println("The bike is cycling on the street.");
 }
}

//Boat subclass
class Boat extends Vehicle {
 @Override
 public void move() {
     System.out.println("The boat is sailing on the water.");
 }
}

//Test class with main method
public class Transport {
 public static void main(String[] args) {
     Vehicle myCar = new Car();
     Vehicle myBike = new Bike();
     Vehicle myBoat = new Boat();

     myCar.move();   // Output: The car is driving on the road.
     myBike.move();  // Output: The bike is cycling on the street.
     myBoat.move();  // Output: The boat is sailing on the water.
 }
}
