// package Patterns;

public class HalfPyramid {
    public static void main(String[] args) {

        //eiher we can assign the the value or take it through user by sacnner class
        int n = 4;

        for(int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= i; j++) {
                 System.out.print("*");
            } 
            System.out.println();
        }



    }
    
}
