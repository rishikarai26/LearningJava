package SystemInput;
// Java Program to Illustrate Scanner Class

// Importing Scanner class from
// java.util.Package
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");

        // Using nextInt() to parse integer values
        int a = sc.nextInt();
        
        System.out.println("Enter a String");

        // Using nextLine() to parse string values
        String b = sc.nextLine();
        sc.close();;

        // Dispaly name and age entered above
        System.out.println("You have enterd: - " + a + " " + "and name as" + b);
    }

    
}
