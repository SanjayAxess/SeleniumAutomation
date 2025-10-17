package Task12Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"Apple");
        map.put(2,"Hussain");
        map.put(3,"Lexis");
        map.put(4,"Brocolli");
        map.put(5,"Delhi");
        map.put(6,"Unicorn");
        map.put(7,"Java");

        System.out.println("HashMap : "+map);

        // Print only keys
        System.out.println("Keys : "+map.keySet());


        //Print only Values
        System.out.println("Values: " + map.values());

        // Print entries (key-value pairs)
        System.out.println("Entries: " + map.entrySet());

        //Print Access Value using key
        System.out.println("Value of key 3 : "+map.get(3));

        //Check if key exits--boolen type
        System.out.println("Conatins the key 2 ? "+map.containsKey(2));

        //Check if values exits  -boolen type
        System.out.println("Contains the value Honda ? : "+map.containsValue("Honda"));

        //Remove a key value
        map.remove(5);
        System.out.println("After removing key 5 : "+map);

        //Iterating the loop using for each
        for(Map.Entry<Integer,String> m:map.entrySet()){
            int key= m.getKey();
            String Value= m.getValue();
            System.out.println("Key : "+key+"    Values : "+Value);
        }


    }
}
