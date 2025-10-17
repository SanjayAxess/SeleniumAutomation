package Task12Collections.List;

import java.util.LinkedList;

public class LinkedListAddNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> numbers =new LinkedList<Integer>();

        numbers.add(3);
        numbers.add(6);
        numbers.add(93);
        numbers.add(34);
        numbers.add(13);
        numbers.add(56);
        numbers.add(86);
        numbers.add(1233);
        numbers.add(34567);

        System.out.println("Original List : "+numbers);

        // Add number at first and last position
        numbers.addFirst(67);
        numbers.addLast(34562);
        System.out.println("List After Adding Numbers : "+numbers);

        //Adding by using index
        numbers.add(2,66);
        System.out.println("List After Adding Numbers by using index : "+numbers);

        //Removing by uisng index
        numbers.remove(5);  //remove -34 using index 5
        System.out.println("List After remove Number by using index : "+numbers);

        // Get first and last elements
        System.out.println("First Element : "+numbers.getFirst());
        System.out.println("Last Element : "+numbers.getLast());

        //Check if number exits or not
        System.out.println("Does list contains 86 : "+numbers.contains(86));


        //Printing all numbers in loop
        for(Integer number:numbers){
            System.out.println(number);
        }


    }
}
