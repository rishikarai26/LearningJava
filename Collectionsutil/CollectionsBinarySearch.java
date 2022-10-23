package Collectionsutil;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Aim - to search for an element in the list using the binarySearch() 
// method available on the collections class
// the list must be sorted from before

public class CollectionsBinarySearch {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Z");
        l.add("A");
        l.add("X");
        l.add("B");

        System.out.println("Before Sorting:" + l);

        Collections.sort(l);

        System.out.println("After Sorting:" + l);

        // Insertion point A = -1, B = -2, 
        // if the element which we are finding is not in the list 
        // than binarySearch() tells us the insertion point
        // that is where the element can be inserted
        int result = Collections.binarySearch(l, "F");
        System.out.println("Index is:" + result);



    }
    
}
