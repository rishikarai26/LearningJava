package BharathJavaCollections;

import java.util.Set;
import java.util.TreeSet;

// Aim - orders the string in alphabetical order

public class StringTreeSet {
    public static void main(String[] args) {


        // Run time polymorphism
        Set<String> set = new TreeSet<>();

        set.add("abc");
        set.add("xyz");
        set.add("def");
        set.add("mno");

        //     for (int i = 0; i < set.size(); i++) {
        //         System.out.println(set.get(i) + "");
        // }

        // for each loop
        
        for (String obj : set) {
            System.out.println(obj);
        }

    }   
    
           
}
