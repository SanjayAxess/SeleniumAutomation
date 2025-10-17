package Task13Casting.UpcastingWithVehicles;

public class Bike extends Vehicle{
    public void move (){
        System.out.println("The Bike is riding very fast");
    }

    public static void main(String[] args) {
        //upcasting by assigning Car and Bike objects to Vehicle references.
        Vehicle car=new Car();
        car.move();
        Vehicle bike=new Bike();
        bike.move();
    }
}
