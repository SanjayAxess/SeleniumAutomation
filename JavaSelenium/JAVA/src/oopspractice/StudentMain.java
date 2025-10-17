package oopspractice;

public class StudentMain {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.sid=001;
        stu1.sname="Hussain";
        stu1.grade='A';
        stu1.printData();

        Student stu2=new Student();
        stu2.sid=001;
        stu2.sname="Hari";
        stu2.grade='A';
        stu2.printData();
    }
}
