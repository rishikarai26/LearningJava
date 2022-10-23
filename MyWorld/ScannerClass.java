package MyWorld;
// Java program to Illustrate Scanner Class

// Importing Scanner class from 
// java.util package
import java.util.Scanner;

// Main class
public class ScannerClass {
    // Main driver method
    public static void main(String[] args) {

        // Creating object of Scanner class to
        // read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");

        // Using nextInt() to parse integer values
        int a = sc.nextInt();

        System.out.println("Enter a String");

        // Using nextLine() to parse string values
        String b = sc.nextLine();
        String c = sc.nextLine();

        // Display name and age entered above
        System.out.printf("You have entered:- " + a + " " + "and name as " + c);
        sc.close();

    }
    /*
     * Outputs explanation: In Scanner class if we call
     * nextLine() method after any one of the seven nextXXX()
     * method then the nextLine() does not read values from
     * console and cursor will not come into console it will
     * skip that step. The nextXXX() methods are nextInt(),
     * nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().
     */

    /*
     * In BufferReader class there is no such type of problem.
     * This problem occurs only for the Scanner class, due to
     * nextXXX() methods ignoring newline character and nextLine() only
     * reads till the first newline character. If we use one more call
     * of nextLine() method between nextXXX() and nextLine(), then this
     * problem will not occur because nextLine() will consume the newline character.
     */

}
