package Task12Collections.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class CarBrands {
    public static void main(String[] args) {
        LinkedHashSet<String> cars=new LinkedHashSet<>();

        cars.add("Maruthi Suzuki");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Kia Motors");
        cars.add("Mahindra");
        cars.add("TATA Motors");

        System.out.println("The Brands in set are :  "+cars);

        System.out.println("Does the set contains Brand 'Volks Wagan' :"+cars.contains("Volks Wagan"));

        cars.add("Ford");
        System.out.println("The set after adding 'Ford' : "+cars);

        cars.remove("Mahindra");
        System.out.println("The set after removing Mahindra : "+cars);

        System.out.println("The size of cars set is  "+cars.size());

        //  addAll() - add elements from another set
        LinkedHashSet<String> moreCars=new LinkedHashSet<>();
        moreCars.add("Skoda");
        moreCars.add("Renualt");
        moreCars.add("Citron");
        moreCars.add("Mercedes");
        moreCars.add("Shelby");
        moreCars.add("Mustang");
        moreCars.add("Rolls Royce");
        cars.addAll(moreCars);
        System.out.println("After adding more Brands : "+cars);

        // retainAll() - keep only common elements
        LinkedHashSet<String> LuxuryCars=new LinkedHashSet<>();
        LuxuryCars.add("Mercedes");
        LuxuryCars.add("Shelby");
        LuxuryCars.add("Mustang");
        LuxuryCars.add("Rolls Royce");
        cars.retainAll(LuxuryCars);
        System.out.println("The Set ,After Retaining with Luxury Cars :  "+cars);

        //for loop-iterating
        for(String car:cars){
            System.out.println((car));
        }

        System.out.println();

        //Convert to arrays
//        Object[] arr=cars.toArray();
//        for(Object obj:arr){
//            System.out.println(obj+ " ");
//        }


    }
}
