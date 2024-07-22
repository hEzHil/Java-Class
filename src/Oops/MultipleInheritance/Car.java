package Oops.MultipleInheritance;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("I am the brake of the car");
    }

    @Override
    public void engineType() {
        System.out.println("Petrol Engine");
    }

    @Override
    public void start() {
        System.out.println("I am starting the engine");
    }

    @Override
    public void stop() {
        System.out.println("I am Stopping the engine");
    }
}
