package Task8Constructor.ConstructorOverLoading.RectangleClass;

public class Rectangle {
    int length,width;

    public Rectangle(){
        length=width=1;
        System.out.println("Default Constructor...");
        System.out.println("Area : "+calculteArea()+" in Sq Units");
    }
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
        System.out.println("Parametrized Constructor...");
        System.out.println("Area = "+calculteArea()+" in Sq Units");
    }
    public int calculteArea(){
        return length*width;
    }

    public static void main(String[] args) {

        //Default Constructor
        Rectangle rectangle=new Rectangle();

        System.out.println("----------------");
        //Parametrized Constructor
        Rectangle rectangle1=new Rectangle();
    }
}
