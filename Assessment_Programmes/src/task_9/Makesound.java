package task_9;

//Hierarchial Inheritance
class Animal {
 // Method to be overridden by subclasses
 void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Subclass Dog inheriting from AnimalSounds
class Dog extends Animal {
 // Overriding makeSound() method
 @Override
 void makeSound() {
     System.out.println("Bark");
 }
}

//Subclass Cat inheriting from AnimalSounds
class Cat extends Animal {
 // Overriding makeSound() method
 @Override
 void makeSound() {
     System.out.println("Meow");
 }
}

//Main class to test the hierarchy
public class Makesound {
 public static void main(String[] args) {
     // Create objects of Dog and Cat
     Dog dog = new Dog();
     Cat cat = new Cat();

     // Call makeSound() on each object
     dog.makeSound(); // Output: Bark
     cat.makeSound(); // Output: Meow
 }
}
