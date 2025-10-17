package Task9OOPS.Inheritence.HierarchicalInheritance;

public class Cat extends Animal{
    public void makeSound(){
        System.out.println("The Cat Makes Sound Meow Meow ");
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.makeSound();
    }
}
