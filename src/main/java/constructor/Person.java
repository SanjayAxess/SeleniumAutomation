package constructor;


public class Person {
    private String name;
    private int age;
    public Person(){
        System.out.println("Person constructor called");
    }
    public Person(String name, int age){
        this.name =name;
        this.age=age;
        System.out.println("Person method called");
    }


}



