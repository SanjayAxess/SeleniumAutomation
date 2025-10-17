package task12_Interface;

//Step 1: Define the Playable interface
interface Playable {
 void play();
}

//Step 2: Create the Guitar class implementing Playable
class Guitar implements Playable {
 @Override
 public void play() {
     System.out.println("Strumming the guitar...");
 }
}

//Step 3: Create the Piano class implementing Playable
class Piano implements Playable {
 @Override
 public void play() {
     System.out.println("Playing the piano...");
 }
}

//Step 4: Test the classes
public class Playableinterface {
 public static void main(String[] args) {
     // Create objects of Guitar and Piano
     Playable guitar = new Guitar();
     Playable piano = new Piano();

     // Call the play() methods
     guitar.play(); // Output: Strumming the guitar...
     piano.play();  // Output: Playing the piano...
 }
}
