
package MyWorld;

import java.util.*;

public class RightPascalTriangle {
    public static void main(String[] args) {
        // taking input from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for printing 1st half stars
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for printing 2nd half stars
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

}
