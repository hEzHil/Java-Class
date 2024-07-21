package Oops.HierarchalInheritance;


// Car is parent class .
// Car class is inherited to audi, bmw ,toyota class
// this is called hierarchical inheritance
public class Car {
    String engine;
    int  tyre;
    int door;

    Car(){
        this.engine = "";
        this.tyre = -1;
        this.door = -1;
    }

    public Car(String engine, int  tyre, int door) {
        this.engine = engine;
        this.tyre = tyre;
        this.door = door;
    }
}
