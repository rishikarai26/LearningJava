import java.util.*;

public class Factorial {

    public static void printFactorial(int n) {

        //loop
        //condition check for nrgative numbers  -> we don't have factorials of negative numbers
        if(n < 0) {
            System.out.println("Invalid Numbers");
        }
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial *i ;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //The operator + is undefined for the argument type(s) String,void
        // System.out.println("Factorial of a number is:" +  printFactorial(n));
        printFactorial(n);
         
    }
    
}
