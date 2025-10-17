package task_10_Overriding;

//Base Plant class
class Plant {
 public void grow() {
     System.out.println("The plant is growing.");
 }
}

//Flower subclass
class Flower extends Plant {
 @Override
 public void grow() {
     System.out.println("The flower is blooming beautifully.");
 }
}

//Tree subclass
class Tree extends Plant {
 @Override
 public void grow() {
     System.out.println("The tree is growing taller and stronger.");
 }
}

//Cactus subclass
class Cactus extends Plant {
 @Override
 public void grow() {
     System.out.println("The cactus is storing water and growing slowly.");
 }
}

//Testing the classes
public class Planttypes {
 public static void main(String[] args) {
     Plant myFlower = new Flower();
     Plant myTree = new Tree();
     Plant myCactus = new Cactus();

     myFlower.grow();
     myTree.grow();
     myCactus.grow();
 }
}

