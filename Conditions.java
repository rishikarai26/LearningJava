import java.util.*;

// public class Conditions {
//     public static void main(String[] args) {
//         //scanner class ->use to take input from the user
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
         
//         //here i made mistake (assignment and equal to operator)
//         // Always remember that single equal to means assignment and == equal to means conditonal check
//         if ( a == b) {
//              System.out.println("Equal");
//         } else if(a > b) {
//              System.out.println("a is greater");
//         } 
//         else {
//              System.out.println("a is lesser");

//         }

       
//     }
// }    
    
public class Conditions {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();

          if (a == b) {
               System.out.println("Equal");
               
          } else if (a > b) {
               System.out.println("a is greater");
          } else {
               System.out.println("b is greater");
          }
     }
}
