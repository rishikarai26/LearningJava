package OopsConcept;

//blueprint of pen -> (contains properties; (attributes, behaviour, functions)
class Pen {
    String color;
    String type; //ballpoint, gel

    public void write() {
        System.out.println("writing something");
    }

    public void printcolor() {
        //'this' keyword -> refers to the current object(instance) of the class
        System.out.println(this.color);
    }


}

public class OOPS {

     public static void main(String args[]) {
        

         //making an object of class pen
         //pen1 = object; jiska datatype class ka naam hoga (Pen)
         Pen pen1 = new Pen();

         //way to access properties of a class
         pen1.color ="blue";
         pen1.type = "gel";

         //accessing methods
        // pen1.write();

         Pen pen2 = new Pen();
         pen2.color = "black";
         pen2.type = "ballpoint";

         pen1.printcolor();
         pen2.printcolor();


        }
    
}
