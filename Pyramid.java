public class Pyramid {
    public static void main(String[] args) {
        int n = 5;

        //to print spaces - new way
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //numbers -> print row no, row no times
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
