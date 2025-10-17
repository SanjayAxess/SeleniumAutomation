package task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections_List {
    public static void main(String[] args) {
        // Task 1: ArrayList of Strings (Fruits)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("ArrayList of Fruits: " + fruits);

        // Task 2: LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("LinkedList of Numbers: " + numbers);
    }
}

