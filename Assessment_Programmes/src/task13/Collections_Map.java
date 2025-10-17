package task13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Collections_Map {
    public static void main(String[] args) {
        
        // 1. HashMap
        System.out.println("HashMap Example");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(5, "Cherry");
        hashMap.put(2, "Mango");
        hashMap.put(4, "Grapes");
        System.out.println(hashMap); // Note: Order is not guaranteed
        
        // 2. LinkedHashMap
        System.out.println("\nLinkedHashMap Example");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(5, "Cherry");
        linkedHashMap.put(2, "Mango");
        linkedHashMap.put(4, "Grapes");
        System.out.println(linkedHashMap); // Maintains insertion order
        
        // 3. TreeMap
        System.out.println("\nTreeMap Example");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(5, "Cherry");
        treeMap.put(2, "Mango");
        treeMap.put(4, "Grapes");
        System.out.println(treeMap); // Sorted by keys
    }
}

