import java.util.*;

public class CountingNumbers {

    public static void countingDifferntNumbers(int n) {
        // loop
        int countpositive = 1;
        int countnegative = 1;
        int countzero = 1;
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                countpositive++;
            } else if (i < 0) {
                countnegative++;
            } else if (i == 0) {
                countzero++;
            }

        }
        System.out.println("No. of positive number are:" + countpositive);
        System.out.println("No. of negative number are:" + countnegative);
        System.out.println("No. of zero are:" + countzero);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        countingDifferntNumbers(n);
    }
}
