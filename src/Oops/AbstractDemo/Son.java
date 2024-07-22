package Oops.AbstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {

        System.out.println("This is Son method" );
    }

    @Override
    void carrer() {
        System.out.println("I am going to be backend developer");
    }

    @Override
    void partner() {
        System.out.println("I love Varsha");
    }
}
