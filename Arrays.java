public class Arrays {
    public static void main(String[] args) { // (Strin[] args) -> array of type string
        // defining an array
        int[] marks = new int[3];
        // int marks[] = new int[3];

        // array -> zero indexed

        // int marks[] = {97, 98, 95};
        marks[0] = 97; // phy
        marks[1] = 98; // chem
        marks[2] = 95; // eng

        // to print the marks
        // System.out.println(marks); //->it will print some garbage value ([I@2c7b84de)
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // can use loop to print more elements
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }

}
