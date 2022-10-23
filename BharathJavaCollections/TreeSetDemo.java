package BharathJavaCollections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();

        Set<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 5; i++) {
            int number = obj.nextInt(100);
            set.add(number);
            System.out.println(number);
        }
        System.out.println("TreeSet Elements:" + set);

        // elements are in sorted order - ascending order

        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
            // itr.remove();
        }
        System.out.println(set);




    }
    
}
