import java.util.*;
import java.util.HashSet;
import java.util.Set;


public class HashSetBasics {
    public static void main(String[] args) {
        // Set<Integer> st = new HashSet<>();

    //     st.add(10);
    //     st.add(10);
    //     st.add(10);
    //     st.add(20);
    //     st.add(20);
    //     st.add(30);
    //     st.add(30);
    //     System.out.println(st);


      Set<Integer> set1 = new HashSet<>();
      Set<Integer> set2 = new HashSet<>();

      set1.add(1);
      set1.add(2);
      set1.add(3);
      set1.add(4);

      set2.add(3);
      set2.add(4);
      set2.add(5);
      set2.add(6);

      System.out.println(set1);
      set1.retainAll(set2); // isse dono set ke comman element print ho jayenge
      System.out.println(set1);

      System.out.println(set1.containsAll(set2)); // isse check hota hai ki set1 ke all element set 2 me present hai ki nhi

    }
}
