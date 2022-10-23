package Generics;

// hm koi restiction nhi provide kiye h
// on the type of data which this particular class will except

public class Test {
    public static void main(String[] args) {

        MyGenericClass<String> s = new MyGenericClass<>("Bharath");
        s.displayObjectDetails();
        System.out.println(s.getObject());

        MyGenericClass<Integer> i = new MyGenericClass<>(123);
        i.displayObjectDetails();
        System.out.println(i.getObject());

        MyGenericClass<Double> d = new MyGenericClass<>(23.45);
        d.displayObjectDetails();
        System.out.println(d.getObject());




        // using extends (runnable) keyword we can restrict the type of data
    }
    
}
