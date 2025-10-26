package OOPS;

public class DefMethod {

    //return types, with args
    public int multipli(int a, int b){
        return a*b;
    }

    //return types, without args
    int a = 4;
    int b = 2;

    public int division(){
        return a/b;
    }

    public static void main(String[] args) {
        DefMethod dm = new DefMethod();
        System.out.println(dm.multipli(2,2));
        System.out.println(dm.division());
    }
}
