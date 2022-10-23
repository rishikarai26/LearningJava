package BharathJavaCollections;
import java.util.Queue;
import java.util.PriorityQueue;

// Aim - the priority queue guranty to maintains the order for the fiest time
// after that when u do deletion , insetion than the the order is messed up
// methods - offer(), peek(), poll(), remove()

public class PriorityQueuedemo {
    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<Integer>();

        // if queue is empty the peek() will return null
        System.out.println(q.peek());


        // NoSuchElementException is thrown
        // System.out.println(q.element());

        for (int i = 20; i <= 30; i++) {
            q.offer(i);
        }
        System.out.println( "Queue:" + q);

        System.out.println(q.poll());

        // Bollean value
        System.out.println(q.remove(22));

        System.out.println(q);
    }
    
}
