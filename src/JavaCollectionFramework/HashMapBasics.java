import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String,String> mapping= new HashMap<>() ;

        //insertion
        mapping.put("in","India");
       // mapping.put("in","India2"); // update the value in place of India to India2
        mapping.put("en","England");
        mapping.put("us","United States");

        System.out.println(mapping);

        Map<String,String> table = new HashMap<>();

        table.put("br","brazil");
        System.out.println("Before table" + table);

        table.putAll(mapping); //isse Table wale map ke andar mapping wale map ki saari value insert ho jayegi

        System.out.println("After" + table);

        // deletion
        table.remove("en"); // isse en wali key-pair delete ho jayega
        System.out.println(table); 
        System.out.println(table.size()); // isse table ka size pata lagta hai

       //table.clear(); // isse table ke andar ki saari value delete ho jayegi
       // System.out.println(table.size());

        table.replace("br","Pratyush");  // isse br ki value brazil se replace ho kar Pratyush ho jayega
        System.out.println(table);
    }
}
