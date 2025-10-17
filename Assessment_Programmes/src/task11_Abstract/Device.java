package task11_Abstract;


//Abstract class
abstract class Device1 {
 // Abstract method (no implementation)
 abstract void turnOn();
}

//Subclass Smartphone extending Device
class Smartphone extends Device1 {
 @Override
 void turnOn() {
     System.out.println("Smartphone is turning on... Welcome to Android!");
 }
}

//Subclass Laptop extending Device
class Laptop extends Device1 {
 @Override
 void turnOn() {
     System.out.println("Laptop is booting up... Loading operating system!");
 }
}

//Main class to test the program
public class Device {
 public static void main(String[] args) {
     // Creating objects of subclasses
     Smartphone phone = new Smartphone();
     Laptop laptop = new Laptop();

     // Calling the turnOn() method
     phone.turnOn();
     laptop.turnOn();
 }
}

