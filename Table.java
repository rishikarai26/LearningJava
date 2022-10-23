import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            product = n * i;
            System.out.println(n + " " + "*" +  " " + i + "=" + " " + " " + product);

        }

    }

}
