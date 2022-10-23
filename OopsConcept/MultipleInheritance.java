package OopsConcept;

// Multiple Inheritance (Through Interfaces): In Multiple inheritances, one class can have more than onefeatures from all parent classes. Please note that 
// Java does not supportmultiple inheritances with classes. In java, we can achieve multiple inheritances only through Interfaces. In the image below, Class C is derived from interface A and B.

import java.io.*;
interface one {
    public void print_geek();
}

interface two {
    public void print_for();
}

interface three extends one, two {
    public void print_geek();
}

//kyuki interface ka object nhi bna skte isly child class bnaye h -> phir interface ko implement kiye h -> phir child class ka object bnakr ke interface ke methods or 
//functions ko access kiye h
class child implements three {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }
    public void print_for() { System.out.println("for"); }
}   

//driver class
public class MultipleInheritance {
    public static void main(String[] args) {
        child c = new child();
        c.print_geek();
        c.print_for();
        c.print_geek();

    }

    
}
