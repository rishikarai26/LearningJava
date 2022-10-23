import java.util.*;

public class Product {

    public static int calculateProduct(int a, int b) {
        //we can return a value directly without assigning it to a variable 
        return a * b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //directly printing the function - another way
        
        System.out.println("Product of 2 numbers is:" + calculateProduct(a, b));
        

    }

    
}
