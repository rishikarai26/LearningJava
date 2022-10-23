package CollectionFramework;
// Java Program to demonstrate copying elements
// Using copy() method

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// CopyOneCollectionto Another
public class C4 {
    public static void main(String[] args) {
        // Creating destination list
        List<String> destination_List = new ArrayList<String>(); 

        // Add elements
        destination_List.add("Shoes");
        destination_List.add("Toys");
        destination_List.add("Horse");
        destination_List.add("Tiger");

        // Print the elements
        System.out.println("The origianal destination list is: ");

        for (int i = 0; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(i) + " ");

        }
        System.out.println();

        // Create source List
        List<String> source_List = new ArrayList<>();

        // Add elements
        source_List.add("Bat");
        source_List.add("Frog");
        source_List.add("Lion");

        // Copy the elements from source to destination
        Collections.copy(destination_List, source_List);

        // Printing the modified list
        System.out.println("The destination list after copying is:");

        for (int i = 0; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(i) + " ");
        }

    }

    
}
