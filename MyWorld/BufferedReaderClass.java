package MyWorld;
// Java program to Illustate BufferedReader Class

// the (BufferedReader class) of the (java.io) package 
// can be used with other readers 
// to read data (in characters) more efficiently.

// It extends absstact class Reader

// Importing required class 
import java.io.*;

// Main class
public class BufferedReaderClass {

    // Main driver method
    public static void main(String[] args) throws IOException {

        // Creating object of class inside main() method
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer");

        // Taking integer input
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a String");

        String b = br.readLine();

        // Printing input entities above
        System.out.printf("You have enterd:- " + a + " and name is " + b);
    }

    /*
     * Differences between Scanner and BufferedReader Class in Java:-
     * -> BufferedReader is synchronous while Scanner is not. BufferedReader
     * should be used if we are working with multiple threads.
     * -> BufferedReader has a significantly larger buffer memory than Scanner.
     * -> The Scanner has a little buffer (1KB char buffer) as opposed to the
     * BufferedReader (8KB byte buffer), but it’s more than enough.
     * -> BufferedReader is a bit faster as compared to scanner because the scanner
     * does the parsing of input data and BufferedReader simply reads a sequence of
     * characters.
     */

}
