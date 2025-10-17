package Poly;

public class Access2 extends Access1 {

    private int key = 3893;

    public void getAccess(int passkey){

        //conditional statements
        if(passkey <9998){
        if(passkey==key){
            System.out.println("Password Matched : Granted to Enter");
        }else{
            System.out.println("Passowrd not matched : Not Allowed to Enter");
        }}else{
            System.out.println("Invalid data : Passkey should be less than 9999");
        }
    }

    public static void main() {
        Access2 a2 = new Access2();
        a2.getAccess(10000);

    }
}
