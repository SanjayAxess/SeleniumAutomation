package task_10_Overriding;

//Base Character class
class Character1 {
 public void attack() {
     System.out.println("Character attacks!");
 }
}

//Warrior subclass overrides attack
class Warrior extends Character1 {
 @Override
 public void attack() {
     System.out.println("Warrior swings a sword!");
 }
}

//Mage subclass overrides attack
class Mage extends Character1 {
 @Override
 public void attack() {
     System.out.println("Mage casts a fireball!");
 }
}

//Archer subclass overrides attack
class Archer extends Character1 {
 @Override
 public void attack() {
     System.out.println("Archer shoots an arrow!");
 }
}

//Test class
public class Character {
 public static void main(String[] args) {
     Warrior warrior = new Warrior();
     Character1 mage = new Mage();
     Character1 archer = new Archer();

     warrior.attack();  // Warrior swings a sword!
     mage.attack();     // Mage casts a fireball!
     archer.attack();   // Archer shoots an arrow!
 }
}

