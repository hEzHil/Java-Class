package Oops.MultipleInheritance;

public class Main {
    public static void main(String[] args){

        // Multiple inheritance not available in java
        // Instead we have Interface , they have abstract function
        //Interface is like class but not completely. it is like an abstract class.
        //By default functions are public and abstract in interface.
        //variables are final and static by default in interface.

        // for Car class . Car class is just try and may occur any problem
//        Car car = new Car();
//        car.brake();
//        car.engineType();
//        car.start();
//        car.stop();

       // it will not work so there is an another  method  lets see
//        Media  media = new Car();
//        media.start();

        // Its the correct method
        NiceCar bmw = new NiceCar();
        bmw.start();
        bmw.musicStart();
        bmw.upgradeEngine();
        bmw.start();


    }
}
