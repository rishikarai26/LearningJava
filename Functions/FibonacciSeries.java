import java.util.*;

public class FibonacciSeries {

    // Function to print n Fibonacci Number
    public static void Fibonnaci(int n) {
        int i = 1;
        int num1 = 0, num2 = 1;
        // iterate till i is n;
        while (i < n) {

            // Print the number
            System.out.print(num1 + " ");

            // swapping concept
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

            i++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        Fibonnaci(n);

    }

}
