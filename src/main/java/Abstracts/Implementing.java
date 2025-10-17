package Abstracts;

public  class Implementing extends Design{
    @Override
    public void frame(String frametype) {
        System.out.println("Bike Frame : "+frametype);
    }
    @Override
    public int empID(int ID) {
        System.out.println("Employee ID: " + ID);
        return ID;
    }

    @Override
    public String empName(String name) {
        System.out.println("Employee name: "+name);
        return name;
    }

    @Override
    public void empLocation(String loc) {
        System.out.println("Employee Location: "+loc);
    }

    @Override
    public String empDesignation(String des) {
        System.out.println("Employee Desgination: "+des);
        return des;
    }

    @Override
    public void empRole(String role) {
        System.out.println("Employee Role: "+role);
    }
   public  static void main() {
       Implementing im = new Implementing();
       im.bikeColor("Green");
       im.frame("Diamond frame");
       im.empID(120);
       im.empName("krishna");
       im.empDesignation("Software Testing");
       im.empRole("Automation Tester");
       im.empLocation("chennai");
    }


}

