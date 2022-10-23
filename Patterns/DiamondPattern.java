public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

        //spaces
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //1st part stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            //2nd part
            

            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //1st part stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            //2nd part
            

            System.out.println();
        }   

    }
    
}
