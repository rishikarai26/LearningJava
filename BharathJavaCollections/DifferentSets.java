package BharathJavaCollections;
import java.util.Random;
import java.util.HashSet;
public class DifferentSets {
    public static void main(String[] args) {

        Random obj = new Random();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= 5; i++) {
            int number = obj.nextInt(100);
            set.add(number);
            System.out.println(number);
        }
        System.out.println("HashSet elements:" + set);
    } 

    // Duplicates are gone but hashset does not maintain the order
    
}
