public class ForLoop {
    public static void main(String[] args) {

        /*
         * for loop
         * initialisation
         * condition - agr hm terminating statement leave kr de to bs print hota jayega
         * jbtk ki computer ki memory n fill ho jaye
         * ( and loops without terminating statement are callrd infinte loops)
         * 
         * updation
         */
        // counter++ => counter = counter + 1
        for (int counter = 0; counter < 10; counter = counter + 1) {
            System.out.println("Hello World");

        }
        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.println(i);
        }

    }

}
