package Inheritance;

public class ElectricCar extends Car {
    String batteryCapacity;
    public void displayBatteryCapacity(String batteryCapacity) {
        System.out.println("BATTERY CAPACITY: "+batteryCapacity);
    }
     static void main(String[] args) {
     ElectricCar ec=new ElectricCar();
     ec.displayBrand();
     ec.displayModel();
     ec.displayBatteryCapacity("56kWh");
    }
}
