package Task9OOPS.Abstraction;

abstract class Vehicle1 {
   abstract void  move();
}

class Bicycle extends Vehicle1{

    void move(){
        System.out.println("The Bicycle is Moving...");
    }
}


