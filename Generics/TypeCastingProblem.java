package Generics;
import java.util.*;
// Aim - array are strict when it comes to type
// other type of data cannot be inserted
// cannot use primitive types in Generics
// we have to use wrapper type or object type



public class TypeCastingProblem {
    public static void main(String[] args) {

        String[] s = new String[10];
        s[0] = "John";
        s[1] = "Rob";
        // s[2] = 123 - type mismatch: cannot convert from String to int

        List<String> l = new ArrayList<>();
        l.add("John");
        l.add("Rob");
        l.add("123");

        // Type casting
        String name = (String) l.get(0);
        String name1 = (String) l.get(1);
        String name2 = (String) l.get(2);
        
        // After performing the above operation
        // There is ClassCastException

        System.out.println(s);
        System.out.println(l);


        // note - generics introduced in java 1.5 to provide type safety 
        // and type casting


    }
    
}
