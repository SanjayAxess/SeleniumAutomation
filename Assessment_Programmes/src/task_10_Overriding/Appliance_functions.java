package task_10_Overriding;

//Base Appliance class
class Appliance {
 public void function() {
     System.out.println("This appliance has a general function.");
 }
}

//WashingMachine subclass
class WashingMachine extends Appliance {
 @Override
 public void function() {
     System.out.println("Washing clothes with water and detergent.");
 }
}

//Refrigerator subclass
class Refrigerator extends Appliance {
 @Override
 public void function() {
     System.out.println("Keeping food and beverages cold.");
 }
}

//Microwave subclass
class Microwave extends Appliance {
 @Override
 public void function() {
     System.out.println("Heating and cooking food quickly using microwaves.");
 }
}

//Test the classes
public class Appliance_functions {
 public static void main(String[] args) {
     Appliance[] appliances = {
         new WashingMachine(),
         new Refrigerator(),
         new Microwave()
     };

     for (Appliance appliance : appliances) {

    	 appliance.function();
     }
 }
}