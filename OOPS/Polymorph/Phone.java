package OOPS.Polymorph;

public class Phone {
    public void unlock()
    {
        System.out.println("Phone is unlocked:");
        System.out.println("Welcome to home Screen");
    }
    public void unlock(int pin)
    {
        System.out.println("Phone is unlocked:"+pin);
        System.out.println("Welcome to home Screen");
    }
    public void unlock(String password)
    {
        System.out.println("Phone is unlocked:"+password);
        System.out.println("Welcome to home Screen");
    }

    public static void main(String[] args) {
        Phone ph= new Phone();
        //ph.unlock();
        //ph.unlock(1234);
        ph.unlock("Hello");
    }
}
