package Task9OOPS.Inheritence.ClassAndObject;

public class Car {
    String make;
    String model;
    int year;
    public void displayinfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Car car1=new Car();
        car1.make="Maruthi Suzuki";
        car1.model="Baleno";
        car1.year=2019;
        car1.displayinfo();

        Car car2=new Car();
        car2.make="Tayota";
        car2.model="Hilux";
        car2.year=2024;
        car2.displayinfo();
    }

}
