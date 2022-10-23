package BharathJavaCollections;
import java .util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {

        // class object = newkeyword default constuctor
        ArrayList list = new ArrayList();

        // list.add(new Integer(20));
        list.add(10);// Autoboxing
        list.add(30.45);
        list.add("hello");

        System.out.println(list);
    }
    
    // Aim - how to create instance of an ArrayList
    // & how to add diffent types of object

    // Concept of Generic - within angular bracket <> restrict the tupe to data to be stored

}
