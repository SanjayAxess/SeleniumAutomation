package forLoopandPoly;

import Inheritance.Person;

abstract class bonusCal {
     String name;
     double salary;
      abstract double calculateBonus();
      public  void displayDetails(){
          System.out.println("Employee Name: "+name);
          System.out.println("Salary: "+salary);
          System.out.println("Bonus: "+calculateBonus());
      }
      static class Manager extends bonusCal{
          double calculateBonus() {
              return salary * 0.20;
          }
      }
      static class Developer extends bonusCal{
          double calculateBonus(){
              return salary * 0.15;
          }
      }
      static class Intern extends bonusCal{
        double calculateBonus(){
            return salary * 0.05;
        }
    }

    public static void main(String[] args) {
        bonusCal[] employees = {
                new Manager() {{ name = "Raj"; salary = 80000; }},
                new Developer() {{ name = "Vinoth"; salary = 60000; }},
                new Intern() {{ name = "Kishore"; salary = 20000; }}
        };
        for (int i=0;i< employees.length;i++){
            employees[i].displayDetails();
            double total = employees[i].salary + employees[i].calculateBonus();
            System.out.println("Total: "+total);
            System.out.println();
        }
    }

}

