import java.util.*;

public class ModulusOperator {
    public static void main(String[] args) {

        // scanner class with an object sc is created
        // package is io
        Scanner sc = new Scanner(System.in); // be careful here
        int x = sc.nextInt();
        // if else

        if (x % 2 == 0) {
            System.out.println("Even no");
        } else {
            System.out.println("Odd no");
        }

    }
}
