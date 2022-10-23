package BharathJavaCollections;
import java.util.Map;
import java.util.TreeMap;

public class AssignmentNavigableMap {
    

    public static void main(String[] args) {

        TreeMap<String, Integer>  t = new TreeMap<>();

        t.put("abc", 111);
        t.put("def", 222);
        t.put("ghi", 333);
        t.put("jkl", 444);
        t.put("xyz", 555);

        System.out.println(t.ceilingKey("def"));

        System.out.println(t.higherKey("ghi"));

        System.out.println(t.floorKey("jkl"));

        System.out.println(t.lowerKey("ghi"));

        System.out.println(t.pollFirstEntry());

        System.out.println(t);

        System.out.println(t.pollLastEntry());

        System.out.println(t.descendingMap());





    }
    
}
