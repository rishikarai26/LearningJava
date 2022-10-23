package BharathJavaCollections;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("abc");
        list.add("def");
        list.add("axyz");

        // we can traverse through the list in both
        // forward and backward direction

        ListIterator<String> itr = list.listIterator();

        // forward dir
        System.out.println("Traversing the listint the forward direction:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Traversing the list in the backward direction:");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

    }

}
