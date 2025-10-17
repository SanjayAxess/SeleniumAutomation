package Inheritance;

public class Car extends Vehicle {
    String model ="BE6E";
    void displayModel(){
        System.out.println("MODEL: "+model);
    }
     static void main() {

        Car c = new Car();
        c.displayBrand();  // from Vehicle
        c.displayModel();
    }
}
