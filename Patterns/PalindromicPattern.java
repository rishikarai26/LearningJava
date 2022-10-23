// package Patterns;

public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;

        //spaces
        for(int i = 1; i <=5; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //1st part numbers
            for(int j = i; j >=1; j--) {
                System.out.print(j);
            }
            //2nd part numbers
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // to come to nextline
            System.out.println();
        }
    }
    
}
