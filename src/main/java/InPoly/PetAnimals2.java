package InPoly;

public class PetAnimals2 extends PetAnimals{
   public void Animals(){
       System.out.println("Cat meows");

   }

    static void main() {
        PetAnimals pa= new PetAnimals2();
        pa.Animals();
    }
}
