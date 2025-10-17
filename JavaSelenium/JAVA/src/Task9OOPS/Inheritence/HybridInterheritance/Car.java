package Task9OOPS.Inheritence.HybridInterheritance;
// Subclass: Car extends Vehicle and implements Engine
public class Car extends vehicle implements Engine{

    // Implementing the start() method from Engine interface
    public void start(){
        System.out.println("The Engine is started.");
    }
    // Method to display full behavior
    public void displayDrive(){
        start();//from Engine
        run();//from Vehicle
        System.out.println("Car is now Driving");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.displayDrive();
    }
}
