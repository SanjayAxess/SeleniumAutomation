package Task9OOPS.Polymormism.MethodOverLoading;

public class Calculater {
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculater calculater=new Calculater();
        int result=calculater.add(2,3);
        System.out.println(result);
        int result1= calculater.add(100,-50,200);
        System.out.println(result1);
        double result3= calculater.add(12.75,3.25);
        System.out.println(result3);
    }
}
