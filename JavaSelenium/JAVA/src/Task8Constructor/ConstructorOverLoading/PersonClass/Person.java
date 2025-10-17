package Task8Constructor.ConstructorOverLoading.PersonClass;

public class Person {
    String name;
    int age;

    public Person(){
        name="Unknown";
        age=30;
        displayDeatils();
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        displayDeatils();
    }
    public void displayDeatils(){
        System.out.println("Person Name : "+name);
        System.out.println("Person age : "+age);
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println("---------------");
        Person person1=new Person("Unknown",30);

    }

}
