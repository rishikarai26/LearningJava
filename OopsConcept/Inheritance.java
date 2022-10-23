package OopsConcept;

// Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

//ek generation s dusre generation m pass krna
//ek class ki property jb koi dusri class lena chati h (in java)

//parent class, base class, super class
class Shape{
    String color;

}

//extend keyword -> Triangle class n Shape class ki properties ko inheret (extend ke liya) , le liya
//sub class, child class, extended class, derieved claa
class Triangle extends Shape{

}
//Driver class
public class Inheritance {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.color = "red";

    }
    
}
