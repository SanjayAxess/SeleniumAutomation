package Task13Casting.CastingWithComputers;

public class Laptop extends Computer{
    public void compute(){
        System.out.println("The Laptop is computing Slowly");
    }

    public void refresh(){
        System.out.println("Refresh the desktop");
    }

    public  void taskManager(){
        System.out.println("Open Task Manager and close the Un-necessary apps ");
    }

    public static void main(String[] args) {
        //Upcasting(Desktop -->Computer)
        Computer computer=new Desktop();
        computer.compute();


        Desktop desktop=(Desktop) computer;
        desktop.compute();
        desktop.connectMonitor();
        desktop.connectAccessories();

        System.out.println("---------------------------");

        Computer computer1=new Laptop();
        computer1.compute();

        Laptop laptop=(Laptop) computer1;
        laptop.compute();
        laptop.refresh();
        laptop.taskManager();

    }
}
