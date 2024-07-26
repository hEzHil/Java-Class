package Oops.MultipleInheritance;

public class ElectricEngine implements Engine{
    @Override
    public int divisor(int num) {
        return 0;
    }

    @Override
    public void engineType() {
        System.out.println("Electric Engine ");
    }

    @Override
    public void start() {
        System.out.println("Electric engine starts");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stops");
    }
}
