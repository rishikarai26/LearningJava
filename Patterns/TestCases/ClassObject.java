package TestCases;

//declaring a class
public class ClassObject {
    //class body starts here

    //creating the data members(variables) of the class
    String name = "John";
    int age = 25;

    //creating the methods of the class
    void eat () {
        //methodBody
    }
    void study () {
        //methodBody
    }
    void play() {
        //methodBody
    }
    public static void main(String[] args) {
        //cannot make a static reference to a non static field - name age will not be printed because they are non static memebers
        //in this case u can do 2 things
        //1 -> either make the data members static or
        //2 -> create an object of a class and then access through the object

        // System.out.println("Name of the person: " + name);
        // System.out.println("Age of the person: " + age);
        ClassObject object1 = new ClassObject();
        

    }
    
}//class body ends here
