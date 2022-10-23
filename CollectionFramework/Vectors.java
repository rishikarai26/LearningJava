package CollectionFramework;
/*
 * the primary difference between a vector 
 * and an ArrayList is that a Vector is synchronized 
 * and an ArrayList is non-synchronized. 
*/

// Java Program to demonstrate the 
// working of Vector
import java.io.*;
import java.util.*; 
public class Vectors {
    // Main Method
    public static void main(String[] args) {
        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();

        // Appending new elements at 
        // the end of the list 
        for (int i = 1; i <= 5; i++) {
            v.add(i);
        }
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the vector
        // after deletion
        System.out.println(v);

        // Printing elements one by one 
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
      
    } 

}
