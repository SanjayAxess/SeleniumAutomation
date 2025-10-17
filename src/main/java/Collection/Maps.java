package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    // key value pair
    Map<Integer,String> mp = new TreeMap<>();

    public void addMap(){
        mp.put(2,"vishnu");
        mp.put(1,"hari");

        mp.put(3,"karthi");
        mp.put(4,"prabhu");
        mp.put(5,"vedha");

        System.out.println(mp);

        for(Map.Entry<Integer , String> st : mp.entrySet()){
//            System.out.println(st);
           int key =  st.getKey();
           String value = st.getValue();
            System.out.println("Key is "+key+ " Value is "+value);
        }
    }

    static void main() {
        Maps m=new Maps();
        m.addMap();
    }
}
