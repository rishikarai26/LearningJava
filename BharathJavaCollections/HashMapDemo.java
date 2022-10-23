package BharathJavaCollections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.List;

public class HashMapDemo {
    public static void main(String[] args) {


        // names of the student(String - key), Examination scores(Intger - values)
        Map<String, Integer> map = new HashMap<>();

        // 4 entries in the map is added

        map.put("John", 70);
        map.put("Tom", 60);
        map.put("Lee", 99);
        map.put("Brad", 80);

        // now to get the entries or thr keys alone

        Set<String> keySet = map.keySet();
        System.out.println("Keys:" + keySet);

        // values are the collection of integers
        Collection<Integer> value = map.values();
        System.out.println("Values:" + value);

        // Printing the key and the corresponding value
        for (String key : keySet) {
            System.out.println("Key:" + key + " Value: " + map.get(key));

        }



    }
    
}
