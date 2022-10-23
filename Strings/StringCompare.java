package Strings;

public class StringCompare {
    public static void main(String args[]) {

        String name1 = "tony";
        String name2 = "tony";
        //first character of the String is compared
        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value

        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal:");
        // } else {
        //     System.out.println("Strings are not egual");
        // }
        

        // don't use (==) operator , because on the lomg run it cannot pass many test cases
        if(name1 == name2) {
            System.out.println("Strings are equal:");
        } else {
            System.out.println("Strings are not egual");
        }


        //Gives incorrect answer here
       if(new String("Tony") == new String("Tony")) {
           System.out.println("They are the same string");
        } else {
           System.out.println("They are different strings");
        }
    }       
        
    
}
