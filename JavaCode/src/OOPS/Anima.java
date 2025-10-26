package OOPS;

public class Anima {

    public void sound(){
        System.out.println("Animals makes sound");
    }
    public static class Dog extends Anima{

        public void bark(){
            System.out.println("Dog bark");
        }
    }
    public static class Cat extends Anima{

        public void meow(){
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sound();
        dg.bark();

        Cat ct = new Cat();
        ct.sound();
        ct.meow();
    }
}
