package OopsConcept;
class Learner{
    String name;
    static String school;
}

public class StaticKeyword {
    public static void main(String args[]) {
        //static member calling
        Learner.school ="JVM";

        //non-static -> we have to create an object and then we can access it
        Learner student1 = new Learner();
        student1.name = "Tony";
        System.out.println(student1.school);

    }
    
}
