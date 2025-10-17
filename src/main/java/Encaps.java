public class Encaps {
    private int passcode;

    public int getPasscode() {

        System.out.println("Passcode is : "+ passcode );
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }

    public static void main() {
        Encaps ec = new Encaps();
        ec.getPasscode();
    }




}
