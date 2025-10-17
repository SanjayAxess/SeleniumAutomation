package Task12Collections.Set;

import java.util.HashSet;

public class HashSetCityList {
    public static void main(String[] args) {
        HashSet<String> myCity=new HashSet<>();
        myCity.add("Hyderabad");
        myCity.add("Chennai");
        myCity.add("Banglore");
        myCity.add("Cochin");
        myCity.add("Vizag");
        myCity.add("Madhurai");
        myCity.add("Hyderabad");

        //Print cities in one set
        System.out.println("Cities in Set : "+myCity); //here 2times hyderabd is there but it will print one hyderabad
                                                       //Duplicates not allowed

        //Size of set
        System.out.println("Size of set : "+myCity.size());

        //Print city using loop
        for(String city:myCity){
            System.out.println(city);
        }

        //Check city contains or not
        System.out.println("Does the set contains 'Delhi'? :"+myCity.contains("Delhi"));

        //Remove a city
        myCity.remove("Madhurai");
        System.out.println("Set after removing 'Madhurai' : "+myCity);

        //add a city
        myCity.add("Jaipur");
        System.out.println("Set after adding a city "+myCity);

        //check city is empty
        System.out.println("Is set empty : "+myCity.isEmpty());//boolen type

        //clearing set
        myCity.clear();
        System.out.println("After Clearing,cities : "+myCity);




    }
}
