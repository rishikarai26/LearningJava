package CollectionFramework;

// peforming linked list function by using collection framework without writing the function from scratch

import java.util.*;

public class LinkedlistDemo1 {
    public static void main(String[] args) {
        // format
        LinkedList<String> list = new LinkedList<String>(); // now an empty list is made for us

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size()); // total no. of elements

        // iterate
        for (int i = 0; i < list.size(); i++) {

            // if (list.get(i) == value) -> to comapre a value with the particular postion

            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // remove -> by defult removes first element of the list
        list.remove();
        list.remove(3);
        System.out.println(list);

        // list.removeLast();
        // System.out.println(list);

    }

}
