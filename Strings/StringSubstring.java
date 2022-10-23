package Strings;

public class StringSubstring {
    public static void main(String args[]) {
        String sentence = "My name is tony";

        // substring(beg index, end index)
        // length() -> total number of characters 
        // string index postion starts from 0
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
        

        //  beg index =4, end index = by dedault till length of the string
        // String name = "TonyStark";
        // System.out.println(name.substring(4));

        //note -> strings are IMMUTABLE 

        

    }
    
}
