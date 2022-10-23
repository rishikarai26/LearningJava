package BharathJavaCollections;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

// Aim - to demonstrate the differnce between list and set
public class HashSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();
        // nextInt() h random ke liye

        List<Integer> list = new ArrayList<>();

        // I want 10 random numbers within the range of 1 to 5
        for (int i = 1; i <= 10; i++) {
            int number = obj.nextInt(5);
            list.add(number);
            
            
        }
        System.out.println("List:" + list);

        // beauty of collection - ovelaoded version of hashset constructor
        // list pass kr rhe h jo ki duplicates filter out kr dega
        Set<Integer> set = new HashSet<>(list);

        System.out.println("Set:" + set);
        
    }
    
}
