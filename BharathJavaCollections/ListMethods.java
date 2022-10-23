package BharathJavaCollections;

import java.util.ArrayList;
import java.util.List;


public class ListMethods {
    public static void main(String[] args) {

        // ArrayList<Integer> list = new ArrayList<>();

        // using run time polymorphism & removing the Array portion from List

        // List is an inteface that is implemented by arraylist and linkedlist
        // it is a good pracise to right the interface left side
        // so that on right side u can change easily as per need
        // between arraylist and linkedlist
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 100; i = i + 10) {
            list.add(i);
        }
        System.out.println("List:" + list);

        list.add(2, 100);
        System.out.println("List After Insert:" + list);

        list.set(4, 200);
        System.out.println("List After Replacement" + list);

        // Aim - adding an object at a certain index
        // & replacing an object at a certain index

        List<Integer> secondList = new ArrayList<>();
        secondList.add(111);
        secondList.add(222);
        secondList.add(333);

        System.out.println("Second List:" + secondList);

        list.addAll(5, secondList);

        System.out.println("First List:" + list);

        // Aim - adding one collection to another with addAll()

        if (list.contains(222)) {
            System.out.println("List has the value");
        } else {
            System.out.println("List does not have the value");
        }

        // Aim - searching for a specific value contains()
        // Ending on a positive note

        System.out.println("Elements in the List are:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

        list.remove(4);
        System.out.println("List after deletion" + list);

        // Aim - getting the elements of the list one by one 
        // & removing an object from a particular index





    }

    

}
