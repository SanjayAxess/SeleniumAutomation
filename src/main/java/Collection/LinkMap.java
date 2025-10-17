package Collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkMap {

   public static class LinkA{
       LinkedHashMap<Integer, String> na  = new LinkedHashMap<>();
    public void SMap(){

        na.put(20," B");
        na.put(10," A");
        na.put(30," C");
        na.merge(30, " Xhfef", (oldVal, newVal) -> oldVal + newVal);
        na.replace(20," B"," Hello");
        System.out.println("LinkedHash: "+na);

    }
   }
    public static class treeMap extends LinkA{
        public void newKey() {
            TreeMap<Integer, String> tMap = new TreeMap<>(na);

            System.out.println("tree: "+tMap);

            }
        }

     static void main() {


        treeMap c= new treeMap();
         c.SMap();
        c.newKey();
    }




}


