package Task8Constructor.ParametrizedConstructor.EmployeeClass;

public class Employee {
    String name,position;
    double salary;

    public Employee(String name,String position,double salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
        displaydetails();
    }
    public void displaydetails(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Position : "+position);
        System.out.println("Salary : Rs"+salary);
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Jhon","Manager",65000.00);
        System.out.println("----------------------------------");
        Employee employee1=new Employee("Peter","Clerk",25000.00);
    }
}
