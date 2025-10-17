package Task13Casting.DowncastingWithDevices;

public class Laptop extends Device{
    //@Override
    public void turnOn() {
        System.out.println("Turn on the Laptop");
    }

    public void runCode(){
        System.out.println("Run the code in Intelli J  IDE ");
    }

    public static void main(String[] args) {
        //Upcasting
        Device myDevice=new SmartPhone();
        myDevice.turnOn();
       // myDevice.openApp();---this will not run. so we have to do downcast here

        System.out.println("After DownCasting:--------------------------------------------");

        //Downcasting
        SmartPhone myPhone=(SmartPhone) myDevice;
        myPhone.turnOn();
        myPhone.openApp("Amazon");
    }
}
