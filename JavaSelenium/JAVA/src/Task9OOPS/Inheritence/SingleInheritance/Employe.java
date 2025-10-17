package Task9OOPS.Inheritence.SingleInheritance;

public class Employe extends Person {
    int employeeID;
    public void displayEmployeeinfo(){
        displayInfo();
        System.out.println("Employee ID : "+employeeID);
    }
    public static void main(String[] args) {
       Employe emp=new Employe();
        emp.name="Hussain";
        emp.age=29;
        emp.employeeID=101;
        emp.displayEmployeeinfo();
        System.out.println();
        Employe emp1=new Employe();
        emp1.name="Hari";
        emp1.age=30;
        emp1.employeeID=102;
        emp1.displayEmployeeinfo();
    }
}
