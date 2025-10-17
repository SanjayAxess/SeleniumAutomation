package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setNew {

    Set<String> st = new TreeSet<>();

    public void addData(){
        st.add("Table");
        st.add("Chair");
        st.add("Stand");
        st.add("Lamp");
        st.add("Desk");
        st.add("Stand");



        for(String s : st){
            System.out.println(s);
        }
    }

    static void main() {
        setNew st = new setNew();
        st.addData();
    }


}
