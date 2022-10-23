package Collectionsutil;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// Aim - to learn Collections.sort()

public class SortedList {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Z");
        l.add("A");
        l.add("x");
        l.add("B");

        System.out.println("Before Sorting:" + l);

        Collections.sort(l);

        System.out.println("After Sorting:" + l);



    }
    
}
