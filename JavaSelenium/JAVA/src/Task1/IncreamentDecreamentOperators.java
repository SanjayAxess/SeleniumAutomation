package Task1;

public class IncreamentDecreamentOperators {
    public static void main(String[] args) {
        int a=100;
        System.out.println(a);
        //Pre-increament operator a++
        a++; //a=a+1
        System.out.println(a);
        //Post-increament operator ++a
        int result=++a;  //a=1+a hera first increament happen then later assigment happen
        System.out.println(result);
        //Post-decreament a--
        a--;  //a=a-1
        System.out.println(a);
        int result2=--a;//here first decreament happen then later assigment happen
        System.out.println(result2);




    }
}
