package Oops.Polymorphism;

public class Main {

    public static void main(String[] args) {

        Shapes shapes1 = new Shapes();
        shapes1.area();


       // here which method will be called depends on your object and that method should be in the parent class
        // this will be dynamic or runtime polymorphism
        Shapes shapes2 = new Circle();
        shapes2.area();

        Shapes shapes4 = new Triangle();
        shapes4.area();



        //  this  method is called method overloading
        Square shape3 = new Square();
        shape3.area(20,40);
        System.out.println(shape3.right);
        shape3.area(10,30,40);
        System.out.println(shape3.right+" "+shape3.left+" "+shape3.top);

        // Even though u try to override the method greeting it can't be . because of static variable
        // it will this parent class method
        Shapes shapes6 = new Circle();
        shapes6.greeting();
        // if u try tp create object for circle class also u can't access
        // lets try it
        Circle circle = new Circle();
        // it will call the superclass method only because of static
        circle.greeting();// u can inherit but u cannot override
    }
}
