package Task12Collections.Set;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetNumbers {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();

        numbers.add(45);
        numbers.add(34);
        numbers.add(3);
        numbers.add(7);
        numbers.add(12);
        numbers.add(2344);
        numbers.add(546);

        System.out.println("The Elements in Treeset : "+numbers);

        //for each loop
        System.out.println("Iterating with for each :");
        for(int num:numbers){
            System.out.println(num);
        }
        System.out.println();

        //with iterator
        System.out.println("Iterating with Iterator : ");
        Iterator<Integer> itr= numbers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+ " ");
        }
        System.out.println();

        // First and Last elements--it print the element which is near to that
        System.out.println("First Element : "+numbers.first());
        System.out.println("Last Element : "+numbers.last());

        // Higher and Lower methods
        System.out.println("Numbers higher than 99 : "+numbers.higher(99));
        System.out.println("Number Lower than 99 : "+numbers.lower(99));

        // Removing an element
        numbers.remove(12);
        System.out.println("After removing 10: " + numbers);

        System.out.println("The sze of set : "+numbers.size());






    }
}
