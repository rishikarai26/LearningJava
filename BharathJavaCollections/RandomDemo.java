package BharathJavaCollections;

import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {

        Random obj = new Random();

        int x = obj.nextInt();
        System.out.println("X:" + x);

        // yaha random no generate hoga lekin 100 s jada ka value ka nhi hoga
        int y = obj.nextInt(100);

        System.out.println("Y:" + y);

    }
    
}
