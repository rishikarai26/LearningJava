package Arrays2;

import java.util.*;
public class TwoDArray { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        sc.close();

        //declaring a 2D array
        int numbers[][] = new int[rows][columns];

        //input
        //rows
        System.out.println("Please enter the desired input:");
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<columns; j++) {
               // System.out.println("Please enter the desired input:");
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("Here is your desired 2D array:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++){
               // System.out.println("Here is your desired 2D array:");
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
