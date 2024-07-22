package Oops.MultipleInheritance;

public class PowerEngine implements Engine{

    @Override
    public void engineType() {
        System.out.println("Power Engine");
    }

    @Override
    public void start() {
        System.out.println("Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }
}
