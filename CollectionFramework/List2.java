package CollectionFramework;
// To iterate the elements in the ArrayList
import java.util.*;

public class List2 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        // Adding elements to above object of ArrayList
        al.add("Geeks");
        al.add("Geeks");

        // Adding element at specified position
        // inside list object
        al.add(1, "For");

        // Using for loop for iteration
        for (int i = 0; i <al.size(); i++) {

            // Using get() method to 
            // access particular element 
            System.out.print(al.get(i) + " ");

        }
        System.out.println(al.hashCode());

        // New line for better readability
        System.out.println();

        // NEW CONCEPT - FOR-EACH LOOP FOR ITERATION
        for (String str : al) {
            // Printing all the elements
            // which was inside object
            System.out.print(str + " ");
        }

    }
    
}
