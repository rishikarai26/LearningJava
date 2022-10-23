package CollectionFramework;
// Java progrsm to demonstrste adding elements
// Using addAll() method

// Importing required clsses
import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 

public class C1 {

    // Main driver method
    public static void main(String[] args) {
        // Creating a list
        // Declaring object of string type
        List<String> items = new ArrayList<String>();

        // Adding elemrnts (Items) to the list
        items.add("Shoes");
        items.add("Toys");
        
        // Add one or more elements
        Collections.addAll(items, "Fruits", "Bat", "Ball");

        // Printing the list contents
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }

    }
    
}
