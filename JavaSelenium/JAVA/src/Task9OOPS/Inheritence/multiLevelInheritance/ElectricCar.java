package Task9OOPS.Inheritence.multiLevelInheritance;

public class ElectricCar extends Car {
    int batteryCapacity;
    public void displayBatteryCapacity(){
        System.out.println("The Battery Capacity of car : "+batteryCapacity+" KWh");
    }
    public void displayElectricCarinfo(){
        displayBrand();
        displayModel();
        displayBatteryCapacity();
    }

    public static void main(String[] args) {
        ElectricCar car1=new ElectricCar();
        car1.brand="Tesla";
        car1.model="Delta Plus";
        car1.batteryCapacity=110;
        car1.displayElectricCarinfo();
    }
}
