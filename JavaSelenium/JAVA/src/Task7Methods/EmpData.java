package Task7Methods;

//subclass
class Programmer extends Employee {
    public void Bonus() {
       int  bonus = 10000;
        System.out.println("The bonus is :" + bonus);

    }


    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.EmpSalary();
        p1.Bonus();

    }
}