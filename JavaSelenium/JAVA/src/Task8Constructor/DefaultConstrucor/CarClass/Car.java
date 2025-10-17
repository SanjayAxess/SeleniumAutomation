package Task8Constructor.DefaultConstrucor.CarClass;

public class Car {
    String make,model;
    int year;

    public Car() {
        make = "Kia Motors";
        model = "Carens Clavis";
        year = 2025;
        displayDetails();
    }
    public void displayDetails(){
        System.out.println("Company Name : "+make);
        System.out.println("Model Name : "+model);
        System.out.println("Manufactured Year : "+year);
    }

    public static void main(String[] args) {
        Car car=new Car();
    }
}

