package CollectionFramework;

// Java program to demonstrate the
// working of ArrayList
import java.io.*;
import java.util.*; 

public class ArrayList1 {
    // Main Method
    public static void main(String[] args) {
        // Declaring the Arraylist with
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Appending new elements at 
        // the end of the list
        for (int i = 1; i <=5; i++) {
            al.add(i);
            System.out.println(al);
                      
        }
        // Printing elements
        // System.out.println(al);

        // Remove element at index 3
        System.out.println(al.remove(3));
        al.remove(3);
        System.out.println(al);

        // printing elementsone by one
        for (int i = 0; i <al.size(); i++) {
            System.out.println(al.get(i) + " ");
        }
    } 

    
}
