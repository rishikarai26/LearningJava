package BharathJavaCollections;
import java.util.*;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        // customer id (key) , name (value)
        // Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map = new IdentityHashMap<>(); // does not use equals comaparision
        // but uses == operator and prints both the value

        Integer id1 = new Integer(10);
        Integer id2 = new Integer(10);

        map.put(id1, "Bharath");
        map.put(id2, "Sarath");

        System.out.println(map);

        // hashmap uses dot(.)equals method and not the == operator
        // to see if the two kwys are same



    }
    
}
