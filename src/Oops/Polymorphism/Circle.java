package Oops.Polymorphism;

public class Circle extends Shapes {

    @Override
    void area(){
        System.out.println("This is circle shape");
    }

    // if u try tp create object for circle class also u can't access
    // lets try it
    // it will call the superclass method only because of static
   static void greeting(){
        System.out.println("Hi i am Shapes class");
    }

}
