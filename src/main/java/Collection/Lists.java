package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    //Collection Framework
    //iterable --> List , set, maps


    List<Integer> lis = new LinkedList<>();

    public void addNums(){;
        for ( int i = 0; i<=100; i+=5){
            lis.add(i);
        }

//        for(int num : lis){
//            System.out.println(num);
//        }

        for(int i = lis.size()-1; i>=0;i--){
            System.out.println(lis.get(i));
        }
    }


    public void cast(){
        double a = 1000.99790; // 2 bytes  //Upcasting / Auto boxing
        int dc = (int)a;  //Downcasting / Unboxing
        System.out.println(dc);// 8 bytes
    }
//    List <String>li = new ArrayList<>();
static void main() {
    Lists ls = new Lists();
    //ls.cast();
    ls.addNums();
}
}
