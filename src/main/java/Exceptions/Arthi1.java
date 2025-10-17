package Exceptions;

public class Arthi1 {
    public void add(int a, int b){
        try {
            System.out.println(a/b);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Handled :" +e);
        }

    }
    public void im(String m)throws NewExp{
            try {
                for (int i = 0; i < m.length(); i++) {

                  throw new NewExp("hello new ");
                }
                System.out.println(m.charAt(9));

            } finally {
                System.out.println("hello world");
            }
            }


    static void main() throws NewExp {
        Arthi1 a= new Arthi1();
        //a.add(20,0);
        a.im("hello");

    }
}
