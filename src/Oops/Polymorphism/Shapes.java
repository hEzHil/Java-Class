package Oops.Polymorphism;

public class Shapes {

    // so this is the parent class and the area methods are overridden in the subclass
    // that means they are used the same name of the method that applied here area(). that is overridden
    // it is late binding because it execute Dynamic allocation or run time
    void area(){
        System.out.println("I am the structure of all shapes");
    }

    // Even though u try to override the method greeting it can't be . because of static variable
    // it will this parent class method
   static  void greeting(){
        System.out.println("Hi i am Shapes class");
    }

    // Early binding
    // because it run at compile time or static
    // it is used to prevent overriding
//   final void area(){
//        System.out.println("I am the structure of all shapes");
//    }
}
