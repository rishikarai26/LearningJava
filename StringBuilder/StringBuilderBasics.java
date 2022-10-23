package StringBuilder;

public class StringBuilderBasics {
    public static void main(String args[]) {
        //StringBuilder Declaration
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(1));

        //set char at index 0
        sb.setCharAt(0, 'R'); //iss statement s to changes ho gye string ke inside
        System.out.println(sb);// aur isce print krenge

        //Insert char
        sb.insert(0, 'S');
        System.out.println(sb);

    }
    
}
