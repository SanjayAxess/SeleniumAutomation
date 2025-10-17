package Task13Casting.DowncastingWithInstruments;

public class Piano extends Instrument{
    public void play(){
        System.out.println("Playing the Paino ");
    }

    public void pressKeys(){
        System.out.println("Playing the tune with keys using music notes");
    }

    public static void main(String[] args) {
        //upcasting
        Instrument instrument=new Guitar();
        instrument.play();

        //Downcasting--casting to guitar to access nethod
        Guitar guitar=(Guitar) instrument;
        guitar.tuneStrings();


        //Another one for extra ---for piano

        //Upcasting
        Instrument instrument1=new Piano();
        instrument1.play();//piano version

        //Downcasting
        Piano piano=(Piano) instrument1;
        piano.pressKeys();
    }
}
