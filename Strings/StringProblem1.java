package Strings;
import java.util.*;

public class StringProblem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        // String userinput = sc.nextLine();

        // System.out.println( "The combined length of the string is: " + " " + userinput.length());
         
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;
 
        for(int i=0; i<size; i++) {
        array[i] = sc.next();
        totLength += array[i].length();
        }
 
        System.out.println(totLength);

        


    }
    
}
