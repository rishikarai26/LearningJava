import java.util.*;
public class SumOfOddNumbers {

    // function to calculate sum of odd numbers
    public static int calculateSumOfOddNumbers(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            // another code -> (i % 2 != 0)
            if ((i %2 ) == 1) {
                sum = sum + i;
            } 
        } 
        return sum;
                               
                        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int oddsum= calculateSumOfOddNumbers(n);
        // System.out.println(calculateSumOfOddNumbers(n));
        calculateSumOfOddNumbers(n);
        

    }

}
