import java.util.*;

public class CircumferenceOfCircle {
    public static void calculateCircumference(int radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of a circle is :" + circumference);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        sc.close();

        calculateCircumference(radius);

    }

}
