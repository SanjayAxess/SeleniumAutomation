package OOPS;

public class ElectricCars extends Cars{
    int batteryCapacity;
    public void batteryCharge()
    {
        System.out.println("Battery is charging");
        System.out.println("Battery Capacity is:"+batteryCapacity);
    }
}
