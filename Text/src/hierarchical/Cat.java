package hierarchical;

public class Cat extends Animal{
	@Override
	public void Sound() {
    System.out.println("Cat: Meow");		
	}
	public void name() {
	System.out.println("Cat Meow");	
	}
	public static void main(String[] args) {
    Animal a= new Dog();
    a.Sleep();
    a.Sound();
      
    Animal b= new Cat();
    b.Sound();
   
    Cat c= new Cat();
    c.Sound();
	}
}
