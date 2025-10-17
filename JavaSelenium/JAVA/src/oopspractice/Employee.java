package oopspractice.Class;
//Class is collection of Variable and method
//method=variable
public class Employee {  //Employee is Class

    //Vaiable
    int eid;
    String ename;
    String job;
    int salary;

    //Method
    void display(){
//        System.out.println(eid);
//        System.out.println(ename);
//        System.out.println(job);
//        System.out.println(salary);
        System.out.println(eid+"   "+ename+"   "+job+"   "+salary);
    }



    public static void main(String[] args) {

        //objects have to create in main method

        Employee emp1=new Employee();
        emp1.eid=0001;
        emp1.ename="Hussain";
        emp1.job="Intern";
        emp1.salary=10000;
        emp1.display();

        Employee emp2=new Employee();
        emp2.eid=0002;
        emp2.ename="Hari";
        emp2.job="Trainee";
        emp2.salary=20000;
        emp2.display();

        System.out.println();



    }
}
