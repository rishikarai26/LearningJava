import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        if (n % n == 0 && n % 1 == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }
    
}
