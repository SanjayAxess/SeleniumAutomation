package Task12Collections.List;

import java.util.ArrayList;

public class ArrayListFruitList {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pine Apple");
        fruits.add("Kiwi");
        fruits.add("Dragon Fruit");

        System.out.println("List of fruits : "+fruits);

        // Add a fruit at specific position
        fruits.add(2,"Strawberry");
        System.out.println("Fruits List after Adding : "+fruits);


        //Remove a fruit by name
        fruits.remove("Orange");
        System.out.println("List After Removing by Name: "+fruits);


        //Remove a fruits by index
        fruits.remove(4);//kiwi remove -index 4
        System.out.println("List After Removing by index : "+fruits);

        //Modify/replace/Change
        fruits.set(3,"Avacado");//3-index and avacodo will go in index position 3 and replace pine apple
        System.out.println("List After Modify/replace/Change :  "+fruits);

        //print afruit of Specific index by get
        System.out.println("Fruits at index 3 : "+fruits.get(3));// index 3 is Pine Apple

        //Check if fruit exits
        System.out.println("Does List Contains Papaya : "+fruits.contains("Papaya"));

        //Size of list
        System.out.println("Size of List is "+fruits.size());

        //To print one by one
        System.out.println("Fruits List : ");
        for(String Fruit:fruits){
            System.out.println(Fruit);
        }

        //to clear the list
        fruits.clear();
        System.out.println("After Clearing the list : "+fruits);



    }
}
