package task13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections_Sets {
    public static void main(String[] args) {
        // Task 1: HashSet of cities
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Kolkata");
        System.out.println("HashSet of Cities: " + cities);

        // Task 2: LinkedHashSet of car brands
        LinkedHashSet<String> carBrands = new LinkedHashSet<>();
        carBrands.add("Toyota");
        carBrands.add("BMW");
        carBrands.add("Honda");
        carBrands.add("Ford");
        carBrands.add("Mercedes");
        System.out.println("LinkedHashSet of Car Brands: " + carBrands);

        // Task 3: TreeSet of numbers
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(25);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        numbers.add(30);
        System.out.println("TreeSet of Numbers: " + numbers);
    }
}
