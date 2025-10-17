package Task10PolyMorphism.MethodOverLoading;

public class VolumeCalculation {
      // Cube Volume Calculation method
    public double calculateVolume(double side){
        return side*side*side;
    }

    // Rectangle Prism Volume Calculation method
    public double calculateVolume(double length,double width,double height){
        return length*width*height;
    }

    //Sphere Volume Method
    public double calculateVolume(float radius){
        return (4/3)*3.14*radius*radius*radius;
    }

    public static void main(String[] args) {
        VolumeCalculation volume=new VolumeCalculation();

        System.out.println("Cube Volume :"+volume.calculateVolume(3.5)+" in Cube units");
        System.out.println("Rectangle Prism Volume :"+volume.calculateVolume(3.5,2.8,1.8)+" in Cube units");
        System.out.println("Sphere Volume :"+volume.calculateVolume(3.5f)+" in Cube units");
    }

}
