package Arrays2;
import java.util.*;


public class IndexPosOfAnElement {
    public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      sc.close(); 
      //sc.nextInt ka mtlb object ke through function ko call krna  
      int number[] = new int[size];
      
      System.out.println("Enter the numbers:");
      for(int i=0; i<size; i++) {
         number[i] = sc.nextInt();
        }

        System.out.println("Enter the number whose index position you want to find");
        int x = sc.nextInt();

        //output
        for(int i=0; i<number.length; i++) {
            if(number[i] == x) {
                System.out.println("The required number is at :" + i);
            }
            
        }

    }
    
    
}
