package Task10PolyMorphism.MethodOverLoading;

public class SumCalculation {
    public int sum(int a,int b){
        return a+b;
    }

    public double sum(double a,double b){
        return a+b;
    }

    public double sum(int a,double b){
        return a+b;
    }

    public double sum(double a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        SumCalculation cal=new SumCalculation();
        System.out.println("Sum of two integers : "+cal.sum(10,20));
        System.out.println("Sum of Doubles : "+cal.sum(10.3,10.5));
        System.out.println("Sum of Integer and Double : "+cal.sum(6,6.6));
        System.out.println("Sum of Double and Integer : "+cal.sum(5.8,3));
    }
}
