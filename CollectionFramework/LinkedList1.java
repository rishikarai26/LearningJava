package CollectionFramework;

// Java program to demonstate the
// working of LinkedList
import java.io.*;
import java.util.*;

public class LinkedList1 {
    // main Method
    public static void main(String[] args) {
        // Declaring the Linkedlist
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }
        System.out.println(ll);

        // Remove element at index 3
        ll.remove(3);
        System.out.println(ll);

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i) + " ");
        }

    }

}
