package Task7Methods;

public class GreetingMethod {
    public static void print(){
        System.out.println("Hello! Welcome to the Java Programming..");
    }

    public static void main(String[] args) {
        //Approch1
        GreetingMethod greet=new GreetingMethod();
        greet.print();
           //or
        //Approch2
        GreetingMethod.print();


    }
}
