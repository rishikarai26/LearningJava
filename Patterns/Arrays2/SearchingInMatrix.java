package Arrays2;

import java.util.*;

public class SearchingInMatrix {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        sc.close();

        int numbers[][] = new int[rows][columns];
        //input
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
               numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element whose indices you want to find ");
        int x= sc.nextInt();

        //output
        for(int i=0; i<rows; i++) {
           for(int j=0; j<columns; j++) {
            //compare with x
               if(numbers[i][j]== x) {
                  System.out.println("x found at location (" + i + "," + j + ")");
               }

            }
            //System.out.println("the requires indices is at:" + [i][j]);
        }
    }  
}

