import java.util.*;

public class Power {
    public static void calculatePower(int x, int n) {

        // mathematical function
        System.out.println("Power of x and n is:" + " " + Math.pow(x, n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        calculatePower(x, n);

    }

}
