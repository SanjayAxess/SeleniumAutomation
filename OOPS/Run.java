package OOPS;

public class Run {
    public static void main(String[] args) {
//Cars c=new Cars();
        PetrolCars pc=new PetrolCars();
        pc.brand="Suzuki";
        pc.model="Brezza";
        pc.year=2024;
        pc.mileage="18 KM PL";
        pc.brocher();
        pc.tankCapacity=50;
        pc.fillFuel(20.50);

        pc.startCar();
        pc.stopCar();
        ElectricCars ec=new ElectricCars();

        ec.startCar();
        ec.stopCar();
        ec.batteryCapacity=16;
        ec.batteryCharge();
        ec.brand="BYD";
        ec.model="Morre";
        ec.year=2025;
        ec.mileage="400 MPC ";
        ec.brocher();
    }
}
