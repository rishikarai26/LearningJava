package CollectionFramework;
// Java program to demonstate list interface

import java.util.*;
public class List1 {
    public static void main(String[] args) {

        // Creating an object of List interface
        // IMPLEMENTED by the ArrayList class
        List<Integer> l1 = new ArrayList<Integer>();

        // Adding elements to object of List interface
        // Custom inputs

        // NEW CONCEPT
        l1.add(0, 1);
        l1.add(1, 2);
        System.out.println(l1);

        // Now creating another object of the List 
        // interface implemented by ArrayList class
        // Declaring object of integer type
        List<Integer> l2 = new ArrayList<Integer>();

        // Again adding elements to object of List interface
        // Custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);

        
        // Will add list 12 from 1 index
        l1.addAll(1, l2);

        // removes element from index 1
        l1.remove(1);

        System.out.println(l1);

        
        // Prints element at index 3 in list 1
        // using get() method
        System.out.println(l1.get(3));

        // Replace 0th element with 5
        // in the List 1
        l1.set(0, 5);

        // Again pritning the updated List 1
        System.out.println(l1);

        // to add elements
        l1.add(1, 26);
        System.out.println(l1);
        
   
    }
    
}
