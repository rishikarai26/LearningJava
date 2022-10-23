
public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;

        /*
         * the scope of the variable is until its block , after that it can be used
         * again and again
         */
        // upper half
        for (int i = 1; i <= n; i++) {
            // to print 1st part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // to print spaces
            int spaces = 2 * (n - i); // to reduce the complexity of the program
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // to print 2nd part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        // lower half

        for (int i = n; i >= 1; i--) {
            // to print 1st part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // to print spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // to print 2nd part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
