package task11_Abstract;

//Abstract class
abstract class GameCharacter1 {
 // Abstract methods (no body)
 abstract void attack();
 abstract void defend();
}

//Subclass Warrior
class Warrior extends GameCharacter1 {
 @Override
 void attack() {
     System.out.println("Warrior attacks with a sword!");
 }

 @Override
 void defend() {
     System.out.println("Warrior blocks with a shield!");
 }
}

//Subclass Mage
class Mage extends GameCharacter1 {
 @Override
 void attack() {
     System.out.println("Mage casts a fireball!");
 }

 @Override
 void defend() {
     System.out.println("Mage creates a magic barrier!");
 }
}

//Main class to test
public class GameCharacter {
 public static void main(String[] args) {
     // Create objects of subclasses
     GameCharacter1 warrior = new Warrior();
     GameCharacter1 mage = new Mage();

     // Call their methods
     System.out.println("Warrior Actions:");
     warrior.attack();
     warrior.defend();

     System.out.println("\nMage Actions:");
     mage.attack();
     mage.defend();
 }
}

