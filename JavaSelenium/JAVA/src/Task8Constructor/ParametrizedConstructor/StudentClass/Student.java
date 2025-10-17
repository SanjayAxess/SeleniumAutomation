package Task8Constructor.ParametrizedConstructor.StudentClass;

public class Student {
    String fieldName;
    int rollNumber;
    char grade;

    public Student(String fieldName,int rollNumber,char grade) {
        this.fieldName = fieldName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        displaydeatils();
    }
    public void displaydeatils(){
        System.out.println("Student Name : "+fieldName);
        System.out.println("Student Roll Number : "+rollNumber);
        System.out.println("Student Grade : "+grade);
    }

    public static void main(String[] args) {
        Student student=new Student("Hari Haran",1109,'A');
        System.out.println("------------------------------");
        Student student1=new Student("Jyothi",1107,'B');
    }
}
