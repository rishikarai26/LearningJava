package BharathJavaCollections;

// Aim - how much time it is going to take to add 1 million objects in linkedlist or arraylist
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // ek Object Array banyege jp 1 million elements store krega

        Object[] objects = new Object[1000000];

        // memory to allocate ho gyi h 1 million objexts ko lekin koi value nhi h
        // sbki null value h
        // to ab for loop s hm instantiate krenge(value dalenge)

        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Object(); // instantiate kr rhe h

        }

        // LinkedList<Object> list = new LinkedList<>();
        List<Object> list = new ArrayList<>();

        // now to calculate the time
        long start = System.currentTimeMillis();

        for (int i = 0; i < objects.length; i++) {
            list.add(objects);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time TaKen:" + (end - start));

    }

}
