package OOPS;

public class Cars {
    String brand;
    String model;
    String mileage;
    int year;
public void startCar(){
        System.out.println("Car has been Started");

    }
    public void stopCar(){
        System.out.println("Car has been Stopped");
    }
    public void brocher()
    {
        System.out.println("Brand Name:"+brand+"\n"+"Model Name:"+model+"\n"+"Year:"+year+"\n"+"Mileage:"+mileage+"\n");
    }
}
