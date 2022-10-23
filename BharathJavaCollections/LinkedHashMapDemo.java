package BharathJavaCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 70);
        map.put("Tom", 60);
        map.put("Lee", 99);
        map.put("Brad", 80);


        Set<String> keySet = map.keySet();
        System.out.println("Keys:" + keySet);

        Collection<Integer> value = map.values();
        System.out.println("Values:" + value);

        for (String key : keySet) {
            System.out.println("Key:" + key + " Value: " + map.get(key));

        }
        //  The only difference between hashmap and linkedhashmap is that
        // linkedhashmap maitains the order in which object is added

    }
    
}
