package Oops.MultipleInheritance;

public class PowerEngine implements Engine{

    @Override
    public void engineType() {
        System.out.println("Problems.Power Engine");
    }

    @Override
    public void start() {
        System.out.println("Problems.Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Problems.Power Engine Stops");
    }
}
