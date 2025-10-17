package Task9OOPS.Inheritence.HierarchicalInheritance;

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("The Dog Barks : Bow Bow ");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.makeSound();
    }
}
