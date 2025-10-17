package Task13Casting.DowncastingWithDevices;

public class SmartPhone extends Device {
    public void turnOn(){
        System.out.println("The SmartPhone is TurnOn");
    }

    public void openApp(String appName){
        System.out.println("Opening the App : "+appName);
    }
}
