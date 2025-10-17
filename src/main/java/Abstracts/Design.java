package Abstracts;

public abstract class Design implements Class1,Class2{


    public abstract void frame(String frametype); //Without body

    public void bikeColor(String color){                //Concrete method
        System.out.println("Bike Color : "+ color);
    }

}
