package Task10PolyMorphism.MethodOverLoading;

public class AreaCalculation {

    //Circle Area Calculation Method
    public double calculateArea(double radius){
        return 3.14*radius*radius;
    }

    //Rectangle Area Calculation Method
    public double calculateArea(double length,double width){
        return length*width;
    }

    //Triangle Area Calculation Method
    public double calculateArea(double base,double height,boolean isTriangle){
        if(isTriangle){
            return 0.5*base*height;
        }else{
            return  base*height;
        }
    }

    public static void main(String[] args) {
        AreaCalculation area=new AreaCalculation();

        double CircleArea=area.calculateArea(3.5);
        System.out.println(CircleArea+" in Sq Units");
        System.out.println("-----------------------------");

        double RectangleArea=area.calculateArea(4.5,5.5);
        System.out.println(RectangleArea+" in Sq units");
        System.out.println("-----------------------------");

        double TriangleArea=area.calculateArea(1.5,6.5,true);
        System.out.println(TriangleArea+" in Sq units");



    }
}
