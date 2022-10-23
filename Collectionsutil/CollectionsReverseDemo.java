package Collectionsutil;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Aim - to reverse a list using reverse() of Collections class

public class CollectionsReverseDemo {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(8);
        l.add(50);
        l.add(78);

        System.out.println("Before Reversing:" + l);
        Collections.reverse(l);
        System.out.println("After Reversing:" + l);


    }
    
}
