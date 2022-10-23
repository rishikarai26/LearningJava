
import java.util.*;

public class Average {

    public static double calculateAverage(int a, int b, int c) {
        double average = (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println("Average of 3 numbers:" + " " + calculateAverage(a, b, c));
    }

}
