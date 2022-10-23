package OopsConcept;
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    //non parameterised constructor
    Student() {
        System.out.println("constructor called");
    }
}

public class StudentInfo {
    public static void main(String args[]) {
        //when the object is created constructor is called
        Student s1 = new Student();
        s1.name = "rishika";
        s1.age = 19;

        //calling a method
        s1.printInfo();

    }
    
}
