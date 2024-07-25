package Oops.MultipleInheritance;

public class PowerEngine implements Engine{

    @Override
    public int divisor(int num) {
        int n =1;

        for (int i = 2; i < num; i++) {
            int temp = i + n;

        }
    }

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
