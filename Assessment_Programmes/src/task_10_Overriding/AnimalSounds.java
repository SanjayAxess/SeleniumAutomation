package task_10_Overriding;

//Base class
class Animal {
 void sound() {
     System.out.println("Some generic animal sound");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Woof");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Meow");
 }
}

//Subclass Cow
class Cow extends Animal {
 @Override
 void sound() {
     System.out.println("Moo");
 }
}

//Test class
public class AnimalSounds {
 public static void main(String[] args) {
     Animal myDog = new Dog();
     Animal myCat = new Cat();
     Animal myCow = new Cow();

     myDog.sound(); // Woof
     myCat.sound(); // Meow
     myCow.sound(); // Moo
 }
}





