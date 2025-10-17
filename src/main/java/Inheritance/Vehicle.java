package Inheritance;

public class Vehicle {
    String brand;
    public void displayBrand(){
     brand ="Mahindra";
        System.out.println("BRAND: " +brand);
    }

    static void main(String[] args) {
        Vehicle v=new Vehicle();
        v. displayBrand();

    }
}
