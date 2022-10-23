package TestCases;

import java.util.*;

public class TestCase1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // t is the number of times the system is going to pass individual values for a,b and n
        int t = in.nextInt();
        // in.close();
        // for (int i = 0; i < t; i++) {
        //     int a = in.nextInt();
        //     int b = in.nextInt();
        //     int n = in.nextInt();
        //     for (int j = 0; j < n; j++) {
        //         a += b;
        //         if (j > 0)
        //             System.out.print(" ");
        //         System.out.print(a);

        //         b = b * 2;
        //     }
        //     System.out.println("");
        // }
        // in.close();
        for(int i=0;i<t;i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             int sum=a;
    
        for(int j=0;j<n;j++){
            // i need to find the clear concept of the next line between sum+=... and sum = sum + .....
            sum+=Math.pow(2,j)*b;
            System.out.print(sum+" ");
    
       }
       System.out.println();
    
        }
        in.close();
    
    }
}
