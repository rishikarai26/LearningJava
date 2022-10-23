package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    // array ->memory ke ander jb data store hoga to wo continuous form m hoga (ek
    // ke baad ek);
    // ->fixed size
    // ->can store -- primitive datatypes(int, float); objects; primitive ke liye
    // memory bna kr rakhni pdti h

    // need for ArrayList -> non continuous memory
    // -> ArrayList
    // -> can store only objects , jaise hi hm onject bnayege arraylist m jod denge
    // functions
    // add - how to add an element in the list
    // get - how to get a particular element
    // modify - how to add a value in between , how to change a particular value
    // delete, remove - how to remove an element through data structures
    // Iterate/ operations - looping concept

    // defining an ArrayList
    // kyuki AL objects ki hone wali h isly hme (Integer, Float, String, Boolean)
    // name ki class use krni pdegi
    public static void main(String[] args) {

        // defining an AL
        ArrayList<Integer> list = new ArrayList<Integer>(); // agr integers ki list banani h to
        // ArrayList<String> list = new ArrayList<String>(); //agr string ki list banani
        // h to, boolean ko kaise

        // add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list); // array ka list aayega jiske ander elements honge [0, 2, 3]

        // get elements
        // pass the index position of the elements you want
        // list.get(1);
        // System.out.println(list); error (understand it)
        int element = list.get(1);
        System.out.println(element);

        // add element in between
        list.add(1, 1);
        System.out.println(list);

        // set element - kisi position ki element ko change krna
        list.set(0, 5);
        System.out.println(list);

        // delete - kisi v index pr kisi v element ko delete kr skte h
        list.remove(3);
        System.out.println(list);

        // size of ArrayList
        int size = list.size();
        System.out.println(size);

        // loops in AL
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }

}
