package BharathJavaCollections;

import java.util.Random;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 1; i <= 5; i++) {
            int number = obj.nextInt(100);
            set.add(number);
            System.out.println(number);
        }
        System.out.println("Set:" + set);

    }
    // the order in which elements are added the same way it is dispalyed
    // it reatains the order
    
}
