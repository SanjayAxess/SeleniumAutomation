package OOPS;

public class HybridCars extends CngCars{
    public static void main(String[] args) {
        HybridCars hc=new HybridCars();
        hc.tankCapacity=30;
        hc.fillFuel(20.25);
        hc.gasFill();
        hc.startCar();
        hc.stopCar();

    }

    }

