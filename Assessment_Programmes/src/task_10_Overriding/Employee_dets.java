package task_10_Overriding;

//Base class
class Employee {
 protected String name;
 protected int id;

 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public void displayDetails() {
     System.out.println("Employee Name: " + name);
     System.out.println("Employee ID: " + id);
 }
}

//Subclass Manager
class Manager extends Employee {
 private int teamSize;

 public Manager(String name, int id, int teamSize) {
     super(name, id);
     this.teamSize = teamSize;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Role: Manager");
     System.out.println("Team Size: " + teamSize);
 }
}

//Subclass Developer
class Developer extends Employee {
 private String programmingLanguage;

 public Developer(String name, int id, String programmingLanguage) {
     super(name, id);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Role: Developer");
     System.out.println("Programming Language: " + programmingLanguage);
 }
}

//Subclass Intern
class Intern extends Employee {
 private String university;

 public Intern(String name, int id, String university) {
     super(name, id);
     this.university = university;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Role: Intern");
     System.out.println("University: " + university);
 }
}

//Test class
public class Employee_dets {
 public static void main(String[] args) {
     Employee manager = new Manager("Alice", 101, 5);
     Employee developer = new Developer("Bob", 102, "Java");
     Employee intern = new Intern("Charlie", 103, "MIT");

     manager.displayDetails();
     System.out.println();
     developer.displayDetails();
     System.out.println();
     intern.displayDetails();
 }
}

