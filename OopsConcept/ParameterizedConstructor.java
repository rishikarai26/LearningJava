package OopsConcept;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }
    //parameterized constuctor
    //constructor - object - function
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class ParameterizedConstructor {
    public static void main(String args[]) {
        Student s1 = new Student("rishika", 19);
        s1.printInfo();

        //note - java ke ander destructor nhi hota h ,garbage collector hota h jo khud hi jo unsed chije h unhe delete kr deta h

    }
    
}
