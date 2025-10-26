package Switches;

public class Arrays {

    //int [] nums = {25,55,23,67,35,90,100};
    String [] country = {"India", "Singapore", "Russia", "Nepal", "China", "Afghanistan"};
    String countries;

    public void arayss(){
        for (int i = 0; i < country.length; i++){
            countries = country[i];
            System.out.println(country[i]);
        }


    }

    public static void main(String[] args) {
        Arrays ar = new Arrays();
        ar.arayss();
    }
}
