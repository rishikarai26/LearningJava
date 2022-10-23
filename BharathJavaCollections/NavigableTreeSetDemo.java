package BharathJavaCollections;
import java.util.TreeSet;

// Aim - to learn methods ceiling(), higher(), floor(), lower(),
// pollFirst(), pollLast(), descendingSet()

public class NavigableTreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> s = new TreeSet<Integer>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        System.out.println(s);

        // lowest element but greater than 20, 
        // because 20 is there it will print 20
        // if it is commented out than it will print 30
        System.out.println(s.ceiling(20));

        System.out.println(s.higher(40));


        // floor() - works just opposite of ceiling
        System.out.println(s.floor(30));

        // lower() - works just opposite of higher
        System.out.println(s.lower(20));

        System.out.println(s.pollFirst());

        System.out.println(s);

        System.out.println(s.pollLast());

        // returs the set in descending order
        System.out.println(s.descendingSet());








        
        


    }
    
}
