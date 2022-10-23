package CollectionFramework;

import java.util.*;

// pehle s hi java ke ander linked list class h isly jo class hm bnayege uska naam kuch aur hona chahiye
// limked list ka head ko kbhi change nhi krna ni to iske aage wala head bn jayega aur isce related data hm ko denge(manipulation nhi krna h)
public class LinkedListDemo {

    Node head;

    class Node {
        String data;
        Node next;

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add -first ,last
    // first - new node , then point its next towards the head and make this new
    // node the head
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) { // iss condition ka mtlb kya abhi tk loi linked list exist v krti h
            // head m assign kr denge newNode ki value
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // otherwise we will traverse(travel) till last
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    // print
    // null - java
    // NULL - c++

    public void printList() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    // delete first
    public void deleteFirst() {
        // corner case - jb hamari puri list khali ho
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next; // hamara pehla head delete ho chuka h

    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode = null
        while (lastNode.next != null) { // null.next -> error ayega kyuki kuch hai hi ni
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
    }

    public static void main(String[] args) {
        // crating an object
        LinkedListDemo list = new LinkedListDemo();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

    }

}
