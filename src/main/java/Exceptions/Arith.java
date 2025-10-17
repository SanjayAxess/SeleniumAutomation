package Exceptions;

import java.util.InputMismatchException;

public class Arith {

    String name;

    int a;
    int b;
    public void calc(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println(a+ b);
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e){
            System.out.println("Cannot be divided by zero" + e);
        }
        System.out.println(a*b);
    }

    public void getChar(String name) throws InterruptedException {
        Thread.sleep(5000);
        this.name =name;
        try {
            for (int i = 0; i < name.length(); i++) {
                if(i==3){
                    throw new MyExcep("My Exception has been thrown ");
                }
                System.out.println(name.charAt(i));
            }
        }catch (ArithmeticException e){
            System.out.println("Index should be lesser than length");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {

        }
    }

    static void main() throws InterruptedException {
        Arith ar = new Arith();
//        ar.calc(122,0);
            ar.getChar("Hari");
    }
}
