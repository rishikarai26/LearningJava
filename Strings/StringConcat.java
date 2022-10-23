package Strings;

public class StringConcat {
    public static void main(String args[]) {
        //concatenation
        String firstname = "tony";
        String lastname = "stark";
        String fullname = firstname + "@" + lastname;
        System.out.println(fullname);

        //printing length of the string
        // tony@stark -> no. of characters
        System.out.println(fullname.length());

        //chartAt (inbuilt function)  -> Accessing characters of a string
        for(int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
    
}
