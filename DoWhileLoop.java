public class DoWhileLoop {
    public static void main(String[] args) {

        // Exit control loop - one time output is must , whether the condition is
        // satisfied or not
        int i = 0;
        do {
            System.out.println(i);
            i = i + 1;
        } while (i < 11);
    }
}