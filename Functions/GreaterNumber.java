import javax.xml.transform.Source;
import java.util.*;

public class GreaterNumber {

    public static void greatestNumber(int a, int b) {

        if (a > b) {
            System.out.println("Greater Number is a:" + a);
        } else {
            System.out.println("Greater Number is b:" + b);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // calling function
        greatestNumber(a, b);
    }

}
