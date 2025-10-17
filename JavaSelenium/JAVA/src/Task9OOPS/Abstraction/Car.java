package Task9OOPS.Abstraction;

public class Car extends Vehicle1{

    @Override
    void move() {
        System.out.println("The Car is Moving");
    }

    public static void main(String[] args) {
        Car mycar=new Car();
        mycar.move();

        Vehicle1 myBicycle=new Bicycle();
        myBicycle.move();
        Vehicle1 mycar1=new Car();
        mycar1.move();
    }
}

//public static void main(String[] args) {
//
//}
