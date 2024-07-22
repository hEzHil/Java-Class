package Oops.AbstractDemo;

public class Daugter extends Parent{
    public Daugter(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I want to become doctor");
    }

    @Override
    void partner() {
        System.out.println("I am enjoying with my carrer so this is my partner");
    }
}
