package Poly;

public class Access1 {

    // Overloading / Static binding / Compile time polymorphism
    private int key = 1234;
    private String pass = "Hari123";

    public void getAccess(){
        System.out.println("Granted to Enter");
    }

    public void getAccess(int passkey){

        //conditional statements

        if(passkey==key){
            System.out.println("Password Matched : Granted to Enter");
        }else{
            System.out.println("Passowrd not matched : Not Allowed to Enter");
        }
    }

    public void getAccess(String passkey){

        //conditional statements
        if(passkey != null){
        if(pass.equalsIgnoreCase(passkey)){
            System.out.println("Password Matched : Granted to Enter");
        }else{
            System.out.println("Passowrd not matched : Not Allowed to Enter");
        }}
    }

    public static void main() {
        Access1 ai =new Access1();
        ai.getAccess(1234);

    }
}
