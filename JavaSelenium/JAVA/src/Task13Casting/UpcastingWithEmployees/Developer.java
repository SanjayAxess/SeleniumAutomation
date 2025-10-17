package Task13Casting.UpcastingWithEmployees;

public class Developer extends Employee {
    public void work(){
        System.out.println("The Developer will handle the Coding and Develop the Project ");
    }

    public static void main(String[] args) {
        //upcasting by assigning Manager and Developer objects to Employee
        Employee manager=new Manager();
        manager.work();
        System.out.println("-----------------------------------------------");
        Employee developer=new Developer();
        developer.work();
    }
}
