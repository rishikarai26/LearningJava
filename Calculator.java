import java.util.*;

public class Calculator {

    void Sample(int x) {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // This calls in inputs from the computer

        int a = sc.nextInt(); // Input of first number from the user
        int b = sc.nextInt(); // Input of second number from the user
        int result;

        //System.out.println("Enter the mathematical operator to be used : + - * / %" );

        //char operator = sc.next().charAt(0); // Receive input from the user
        int operator = sc.nextInt();
        
        switch (operator) {
            case 1 : 
            result = a + b;
            System.out.println( result);
            break;
            case 2 :
            result = a - b;
            System.out.println( result);
            break;
            case 3 : 
            result = a * b;
            System.out.println(result);
            break;
            case 4 : 
            result = a / b;
            System.out.println(result);
            break;
            case 5 :
            result = a % b;
            System.out.println(result);
            break;
            default :
            System.out.println("exit");
        }
    

        
        

    }
    
}
