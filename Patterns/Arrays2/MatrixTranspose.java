package Arrays2;
import java.util.*;
public class MatrixTranspose { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        sc.close();

        //declaring an array
        int matrix[][] = new int[rows][columns];

        //input
        System.out.println("Please enter the matrix whose transpose you want to find:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        //output
        // System.out.println("The transpose of the matrix is :");
        // for(int i=0; i<columns; i++) {
        //     for(int j=0; j<rows; j++) {
        //         System.out.print(matrix[j][i] + " ");
        //     }
        //     System.out.println();

        // }
        // anthor way ->1
        System.out.println("The transpose of the matrix is :");
        for(int j=0; j<columns; j++) {
            for(int i=0; i<rows; i++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        // another way ->2
        // for(int j=0; j<m ;j++) {
        //     for(int i=0; i<n; i++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
  

        
    }
    
}
