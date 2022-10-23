package Collectionsutil;
import java.util.Arrays;
import java.util.List;

// Aim - how to convert array to list (asList())
// we cannot perform any operation that is going to 
// change the size of the array
// any changes made on the array will reflect on the list 
// and vice - versa

public class ArraysSort {
    public static void main(String[] args) {

        int[] a = { 40, 10, 15, 7};

        System.out.println("Before sort");
        for (int eachElement : a) {
            System.out.println(eachElement);
        }
        
        Arrays.sort(a);

        System.out.println("Before sort");
        for (int eachElement : a) {
            System.out.println(eachElement);

             
        }

        // cannot convert list int to list<Integer>
        // List<Integer> list = Arrays.asList(a);
        // System.out.println(list);

        String[] s = { "V", "A", "z", "p"};

        List<String> list = Arrays.asList(s);
        System.out.println(list);

    }

    
}
