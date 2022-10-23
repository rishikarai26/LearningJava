package OopsConcept;

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}
 //Single level inheritance
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }

}
//multileveelinheritance
class EquilatateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);

    }

}

    

public class SingleInheritance {
    public static void main(String args[]) {

    }
    
}
