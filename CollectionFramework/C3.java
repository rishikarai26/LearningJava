package CollectionFramework;
// java program to demonstrate Binary Search
// Using Collections.binarySearch() 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class
// BinarySearchOnACollection
public class C3 {

    // Main driver method
    public static void main(String[] args) {
        // Creating a List
        // Declaring object of string type
        List<String> items = new ArrayList<>();

        // Adding elements to the object
        // using add() method
        Collections.addAll(items, "Shoes", "Toys", "Horse","Ball","Grapes");

        // Sort the List
        Collections.sort(items);

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
        System.out.println();

        // BinarySearch on the List
        System.out.println("The index of Horse is " + Collections.binarySearch(items, "Horse"));
        
        // BinarySearch on the List
        System.out.println("The index of Rabbit is " + Collections.binarySearch(items, "Rabbit"));
    }
    
    // If the element exists in the list, the method will 
    // return the position of the element in the sorted list, 
    // otherwise, the result returned by the method would be 
    // the – (insertion point where the element should have been present if exist)-1). 
}
