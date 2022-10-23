import java.util.*;

public class EligibleToVote {

    // public static void Voting(int age) {
    // //condition check
    // if(age > 18) {
    // System.out.println("Eligible to vote");
    // } else {
    // System.out.println("Not eligible to vote");
    // }
    // }
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();

    // Voting(age);
    // }

    // -> another way
    // isEligible = identifier(naming)
    public static boolean isEligible(int age) {
        if (age > 18) {

            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isEligible(age));
    }

}
