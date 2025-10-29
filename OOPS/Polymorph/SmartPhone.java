package OOPS.Polymorph;

public class SmartPhone extends Phone{
    public void unlock(int pin)
    {
        System.out.println("Enter 6 digit pin to unlock:"+pin);
        System.out.println("Welcome to home Screen");
    }

    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        sp.unlock(123456);
    }
}
