// package Functions.java;

import java.util.*;
public class PrintingName {
    

//ways of writing identifire
/* printmyname
 * print_my_name
 * printMyName -> CamelCase ( it stars with small letters, as you add words the 1st letter becomed capital)
 */
    public static void printMyName(String name) {
        System.out.println(name);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
    }
      
}
    


