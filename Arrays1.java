import java.util.*;

public class Arrays1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float size = sc.nextFloat();
        sc.close();

        // default initialization
        // int = 0
        // float = 0.0
        // boolean = false
        // String = " "
        float numbers[] = new float[5];
        // input
        // for(int i=0; i<size; i++) {
        // numbers[i] = sc.nextInt(); //imp step -> try to understand it
        // }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

    }

}
