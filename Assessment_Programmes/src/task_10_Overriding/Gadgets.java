package task_10_Overriding;

//Base class
class Gadget {
 public void operate() {
     System.out.println("Operating a generic gadget.");
 }
}

//Subclass for Smartphone
class Smartphone extends Gadget {
 @Override
 public void operate() {
     System.out.println("Making a call and browsing the internet on the smartphone.");
 }
}

//Subclass for Tablet
class Tablet extends Gadget {
 @Override
 public void operate() {
     System.out.println("Watching videos and drawing on the tablet.");
 }
}

//Subclass for Smartwatch
class Smartwatch extends Gadget {
 @Override
 public void operate() {
     System.out.println("Tracking fitness and showing notifications on the smartwatch.");
 }
}

//Demo class with main method to test
public class Gadgets {
 public static void main(String[] args) {
     Gadget generic = new Gadget();
     Gadget phone = new Smartphone();
     Gadget tablet = new Tablet();
     Gadget watch = new Smartwatch();

     generic.operate();
     phone.operate();
     tablet.operate();
     watch.operate();
 }
}

