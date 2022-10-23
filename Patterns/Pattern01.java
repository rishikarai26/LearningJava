// package Patterns;

public class Pattern01 {
    public static void main(String[] args) {
        int n = 5;
        
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            /* i = 1; j = 1
             * i = 2; j = 1, 2, 
             * i = 3; j = 1, 2, 3
             * i = 4; j = 1, 2, 3, 4
             * i = 5; j = 1, 2, 3, 4, 5
             */


            for(int j=1; j<=i; j++) {
                int sum = i+j;

                if(sum % 2 == 0) { // even position
                    System.out.print("1 ");
                    
                } else { //odd position
                    System.out.print("0 ");
                    
                }
                
            } 
            System.out.println();

        }
    }
    
}
