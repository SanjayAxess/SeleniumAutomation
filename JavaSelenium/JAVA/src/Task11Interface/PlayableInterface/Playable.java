package Task11Interface.PlayableInterface;

//Objective: Create an interface called Playable with a method play(). Then, create two classes Guitar
//and Piano that implement the Playable interface and provide implementations for the play() method.
interface Playable {

    void play();
}

class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Play the Guitar");
    }
}

//First method
/*class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Piono Keys");
    }

    public static void main(String[] args) {
        Playable myguitar = new Guitar();
        myguitar.play();
        Playable myPiano = new Piano();
        myPiano.play();
    }
}*/

//2nd method
class Piano extends Guitar implements Playable {
    @Override
    public void play() {
        super.play();//if we use this then it will print immediate parent class data as it is not print overrideed data
                       // output -Play the Guitar
                       //Super is worked on immediate parent class method and variab;
                       //super is not used for interfaces
        System.out.println("The Piano Keys is Playing");
        //super.play();
    }

    public static void main(String[] args) {
        //Direct calling method
        Piano myplay=new Piano();
         myplay.play();

       //2nd method
        Playable myGuitar1=new Guitar();
        myGuitar1.play();
        Playable myPiano1=new Piano();
        myPiano1.play();


    }
}

