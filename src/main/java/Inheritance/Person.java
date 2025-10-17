package Inheritance;


public class Person {
    String name ="Murali";
    int age =26;

    public void displayEmplyoeeInfo() {
        System.out.println(name);
        System.out.println(age);
    }
    public static class Employee extends Person{
        int employeeId = 1293;
        public void displayInfo() {
            System.out.println(name);
            System.out.println(age);
            System.out.println(employeeId);
        }
    }

     static void main(String[] args) {
        Employee ep = new Employee();
        ep.displayInfo();
    }
}

