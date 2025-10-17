package Task12Collections.Map;

import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    Map<Integer,String> map=new java.util.TreeMap<>();

    //Method to add a key-value pair

    public void addEntry(int key,String value){
        map.put(key,value);
        System.out.println("Added : key = "+key+" , Value = "+value);
    }

    //Method to remove an entry key
    public void removeEntry(int key){
        if(map.containsKey(key)){
            map.remove(key);
            System.out.println("Removed entry with key : "+key);
        }else{
            System.out.println("key "+key+"is not Found");
        }
    }

    //method to update value
    public void updateEntry(int key,String newValue){
        if(map.containsKey(key)){
            map.put(key,newValue);
            System.out.println("Updated Entry: Key = "+key+" , Value = "+newValue);
        }else{
            System.out.println("Key "+key+" not Found .");
        }
    }

    //Method to search a key
    public void searchKey(int key){
        if(map.containsKey(key)){
            System.out.println("Found : Key = "+key+" ,Value ="+map.get(key));
        }else{
            System.out.println("Key "+key+" not Found .");
        }
    }

    // Method to search for a value
    public void searchValue(String value) {
        if (map.containsValue(value)) {
            System.out.println("Value \"" + value + "\" exists in the map.");
        } else {
            System.out.println("Value \"" + value + "\" not found.");
        }
    }

    //Method to display all entries
    public void displayMap(){
        System.out.println("TreeMap Entries(Sorted Key) : ");
        for(Map.Entry<Integer,String> mp:map.entrySet()){
            int intKey= mp.getKey();
            String strValue=mp.getValue();
            System.out.println("Key : "+intKey+",  Value : "+strValue);
        }
    }

    // Method to clear the map
    public void clearMap() {
        map.clear();
        System.out.println("All entries have been cleared.");
    }

    public static void main(String[] args) {

        TreeMap tree=new TreeMap();
        Scanner scanner=new Scanner(System.in);

        tree.addEntry(106,"Java");
        tree.addEntry(104,"Python");
        tree.addEntry(101,"C++");
        tree.addEntry(102,"Java script");
        tree.addEntry(109,"Groovy");
        tree.addEntry(105,"Shell");

        tree.displayMap();

        //Search a key
        System.out.println("Enter the key to Search :");
        int searchKey= scanner.nextInt();
        tree.searchKey(searchKey);

        // Search for a value
        scanner.nextLine(); // consume newline
        System.out.print("\nEnter a value to search: ");
        String searchValue = scanner.nextLine();
        tree.searchValue(searchValue);

        // Update a value
        System.out.print("\nEnter a key to update: ");
        int updateKey = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new value: ");
        String newValue = scanner.nextLine();
        tree.updateEntry(updateKey, newValue);


        //Remove  an entry
        System.out.println("\nEnter an key to remove : ");
        int removeKey= scanner.nextInt();
        tree.removeEntry(removeKey);

        //Display updated map
        System.out.println("\nUpdated Map ");
        tree.displayMap();



    }
}
