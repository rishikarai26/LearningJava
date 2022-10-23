package BharathJavaCollections;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);

        // Iterator in action
        Iterator<Integer> itr = list.iterator();

        // we use while loop to iterate through the objects
        while(itr.hasNext()) {
            System.out.println(itr.next()); // for displaying elements
            itr.remove(); // for removing all elements
        }
        System.out.println(list);


    }

    
}
